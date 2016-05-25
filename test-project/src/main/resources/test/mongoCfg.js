var run = false
var ran = false
var EventEmitter = require('events').EventEmitter
var emitter = new EventEmitter()
var path = require('path')
var assert = require('assert')
require('./fakeCassandra')

emitter.setMaxListeners(0)
module.exports = function (done) {
  if (!run) {
    run = true
    require(path.resolve('test', 'test_config', 'mongo.js')).call(
      {
        settings: {
          env: 'development'
        }
      },
      function (err) {
        assert.ifError(err)
        require(path.resolve('test', 'test_config', 'schema.js')).call({
          yaktor: {}
        })
        ran = true
        emitter.emit('done')
        done()
      })
  } else if (ran) {
    done()
  } else {
    emitter.once('done', done)
  }
}
