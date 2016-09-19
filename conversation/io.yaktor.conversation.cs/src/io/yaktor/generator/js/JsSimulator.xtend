package io.yaktor.generator.js

import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation
import io.yaktor.conversation.PrivatePubSub

import static extension io.yaktor.generator.js.JsData.*
import static extension io.yaktor.generator.js.JsExtensions.*
import io.yaktor.conversation.StateMachineType

import static extension io.yaktor.generator.js.JsTypesExtensions.*

class JsSimulator {
  def genSimulator(Conversation c) {
    '''
      process.on('uncaughtException', function (err) {
        console.log(err.stack)
      })
      var path = require('path')
      var mongo = require(path.resolve('config', 'global', '02_mongo.js'))
      mongo({mongo: {host: 'mongo'}}, function () {})
      require(path.resolve('src-gen', 'modelAll'))
      «FOR dto : c.reachableAgents.filter[a|a.projection != null].map[a|a.projection.fullName].toSet»
        var «dto.replace(".", "$")» = require(path.resolve('conversations', 'types', '«dto»'))
      «ENDFOR»
      var argv = require('commander')
      var async = require('async')
      var mocker = require('yaktor/test/mocker')
      
      argv.option('-i, --iterations [n]', 'how many times to run a simulation', parseInt, 50)
      .option('-u, --urlPrefix [value]', 'override urlPrefix', String.valueOf(), 'http://localhost:3000')
      .option('-d, --default-id [string]', 'id to be used if none is provided', 'defaultId')
      «FOR agent : c.reachableAgents.filter[a|a.projection != null]»
        .option('--«agent.parent.name.toLowerCase»-«agent.name.toLowerCase» <string>', 'Id of a persisted «agent.
        projection.name» for «agent.parent.name».«agent.name»')
      «ENDFOR»
      «FOR agent : c.reachableAgents.filter[a|a.projection != null]»
        .option('--ignore-«agent.parent.name.toLowerCase»-«agent.name.toLowerCase»', 'Should this agent be skipped while initializing agents.')
      «ENDFOR»
      .option('-v, --verbose', 'verbose')
      .parse(process.argv)
      
      var times = function (async, times, task, callback) {
        var count = 0
        var stop = false
        var done = 0
        var cb = function (err) {
          done++
          if (err) {
            stop = true
            callback(err, done)
          } else if (done === times) {
            callback(null, done)
          } else if (!async) {
            process.nextTick(pt)
          }
        }
        var pt = function () {
          if (!stop && count++ < times) {
            task(count, cb)
            if (async) {
              process.nextTick(pt)
            }
          }
        }
        pt()
      }
      var start = new Date().getTime()
      var infiniteChildren = []
      times(false, argv.iterations, function (n, callback) {
        async.parallel([
          «FOR agent : c.reachableAgents.filter[a|a.projection != null && a.stateMachineType == StateMachineType.FINITE] SEPARATOR ','»
            function (callback) {
              if (argv.ignore«agent.parent.name.toLowerCase.toFirstUpper»«agent.name.toLowerCase.toFirstUpper») return callback()
              «agent.projection.fullName.replace(".", "$")».findOne({ _id: argv.«agent.parent.name.toLowerCase»«agent.
      name.toLowerCase.toFirstUpper» || argv.defaultId }, function (ignoredError, dto) {
                var processData = {
                  n: n,
                  args: argv,
                  dto: dto
                }
                mocker(path.join(__dirname, '«agent.parent.name»', '«agent.name».js'), processData, callback)
              })
            }
          «ENDFOR»
        ], callback)
      },
      function () {
        var end = new Date().getTime()
        var time = (end - start) / 1000
        console.log('total: %s time: %s (s); result: %s (tp/s)', argv.iterations, time, (argv.iterations / time))
        async.each(infiniteChildren, function (p, done) {
          p.kill()
          done()
        }, process.exit)
      })
      «FOR agent : c.reachableAgents.filter[a|a.projection != null && a.stateMachineType != StateMachineType.FINITE] »
        if (!argv.ignore«agent.parent.name.toLowerCase.toFirstUpper»«agent.name.toLowerCase.toFirstUpper») {
          «agent.projection.fullName.replace(".", "$")».findOne({ _id: argv.«agent.parent.name.toLowerCase»«agent.
      name.toLowerCase.toFirstUpper» || argv.defaultId }, function (ignoredError, dto) {
            var processData = {
              qId: qId,
              args: argv,
              dto: dto
            }
            infiniteChildren.push(mocker(path.join(__dirname, '«agent.parent.name»', '«agent.name».js'), processData))
          })
        }
      «ENDFOR»
    '''
  }

  def genSimulator(Agent a) {
    '''
      process.on('uncaughtException', function (err) {
        console.log(err.stack)
      })
      var path = require('path')
      var agentApi = require(path.resolve('public', 'api', '«a.parent.name»', '«a.name».js'))
      var socketApi = require(path.resolve('public', 'socketApi.js'))
      process.on('message', function (processData) {
        var dto = processData.dto || {}
        var dataSet = {
          «FOR event : a.events.filter(PrivatePubSub) SEPARATOR ','»
            '«event.name»': «event.genData("'")»
          «ENDFOR»
        }
        var me = processData.«a.name» || {}
        var script = me.script || {}
        console.log('starting %s, %s', '«a.name»', processData.n)
        var client = socketApi.connectWithPrefix(processData.args.urlPrefix, null, function (cb) {
          cb()
        }, processData.args.verbose)
      
        for (var state in agentApi.stateMatrix) {
          (function (state) {
            client.on('message', function (topic, payload) {
              // var body = JSON.parse(payload.toString())
              var state = topic.replace(/«a.parent.name»\/«a.name»\/state\/([^\/]*)\/.*/, '$1')
              if (agentApi.terminalStates[state]) {
                // inform parent that we are done
                process.send(processData)
                socketApi.disconnect(processData.args.urlPrefix)
                if (processData.args.verbose) {
                  console.log('disconnect %s/state/%s/ seq:%s', '«a.name»', state, processData.n)
                }
                process.exit(0)
              } else {
                var myEventsToFire = Object.keys(agentApi.stateMatrix[state])
                if (myEventsToFire.length) {
                  var event = script[state] || myEventsToFire[parseInt(Math.random() * myEventsToFire.length)]
                  client.publish('«a.parent.name».«a.name»/' + event, JSON.stringify({ agentData: dto, data: dataSet[event] }))
                }
              }
            })
          })(state)
        }
      
        client.on('connect', function (socket, data) {
          processData.args.verbose && console.log('«a.name» connected %s', processData.n)
          client.subscribe('«a.parent.name»/«a.name»/state/+/' + dto._id)
        })
      })
      process.send({ loaded: true })
    '''
  }
}
