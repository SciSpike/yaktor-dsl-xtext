/* global describe, it */
var path = require('path')
var assert = require('assert')
var mongoose = require('mongoose')
var mockgoose = require('mockgoose')
var Promise = require('bluebird')
mockgoose(mongoose)
// warm things up a bit
require('mongoose-shortid-nodeps')
var proxyquire = require('proxyquire')
function Global (m) {
  m[ '@noCallThru' ] = true
  m[ '@runtimeGlobal' ] = true
  return m
}
var noop = function () {}
var logger = {
  silly: noop,
  debug: noop,
  info: noop,
  warn: noop,
  error: noop
}
var proxy = {
  'yaktor/logger': Global(logger),
  'mongoose': Global(mongoose)
}
require(path.resolve('src-gen', 'modelAll'))

mongoose.model('AgentConversation', new mongoose.Schema({agent: String, state: String, agentDataId: String}))

describe('Agent', function () {
  describe('Test.Test', function () {
    it('should be loaded', function () {
      var Test = proxyquire(path.resolve('conversations', 'js', 'Test'), proxy)
      var tt = 'Test.Test'
      var td = 'Test.TestDepend'
      var ptt = Promise.fromCallback(function (cb) {
        Test.agents[tt].init({ agentDataId: tt }, function (ac) {
          assert.ok(ac)
          cb()
        })
      })
      var ptd = Promise.fromCallback(function (cb) {
        Test.agents[td].init({ agentDataId: td }, function (ac) {
          assert.ok(ac)
          cb()
        })
      })
      assert.ok(Test.agents[tt])
      assert.ok(Test.agents[tt].states)
      assert.ok(Test.agents[tt].states.working)
      assert.ok(Test.agents[tt].states.working.transitions)
      assert.ok(Test.agents[tt].states.working.transitions.finished)
      assert.ok(Test.agents[tt].states.working.transitions.finished.to)
      assert.equal(Test.agents[tt].states.working.transitions.finished.to, Test.agents[tt].states.done)
      assert.ok(Test.agents[td])
      return Promise.all([ptt, ptd])
    })
  })
  describe('UserUnitTest.Test.Test', function () {
    it('should be loaded', function () {
      var Test = proxyquire(path.resolve('conversations', 'js', 'Test'), proxy)
      proxy[path.resolve('conversations', 'js', 'Test', 'Test')] = Global(Test)
      var UserUnitTest = proxyquire(path.resolve('conversations', 'js', 'UserUnitTest'), proxy)

      var utr = 'UserUnitTest.Reach'
      var utrp = Promise.fromCallback(function (cb) {
        UserUnitTest.agents[utr].init({ agentDataId: utr }, function (ac) {
          assert.ok(ac)
          cb()
        })
      })

      assert.ok(Test.agents['Test.Test'])
      assert.ok(UserUnitTest.agents['Test.Test'])
      assert.equal(UserUnitTest.agents['Test.Test'], proxy[path.resolve('conversations', 'js', 'Test', 'Test')])
      return utrp
    })
  })
})
