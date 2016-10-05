/* global describe, it */
var path = require('path')
var mongoose = require('mongoose')
var proxyquire = require('proxyquire')
function Global (m) {
  m[ '@noCallThru' ] = true
  m[ '@runtimeGlobal' ] = true
  return m
}

var noop = function () {}
var renoop = function () { return noop }
var proxy = {
  'yaktor/services/conversionService': Global({
    to: noop,
    from: noop,
    toQuery: noop,
    fromQuery: noop
  }),
  'yaktor/services/Response': Global({
    create: renoop,
    read: renoop,
    update: renoop,
    delete: renoop,
    find: renoop
  }),
  'mongoose': Global(mongoose)
}
var rest = function (path, m, cb) {
  cb({
    params: {
      id: 'id'
    }
  }, {}, noop)
}
var test = function (path, cb) {
  cb({
  }, {
    render: noop
  }, noop)
}
describe(path.basename(__filename), function () {
  it('should be able to import rest routes', function () {
    var restRoutes = proxyquire(path.resolve('routes', 'DEFAULT', 'Test'), proxy)
    // init and invoke all methods
    restRoutes({
      app: {
        get: rest,
        put: rest,
        post: rest,
        delete: rest
      }
    })
  })
  it('should be able to import test routes', function () {
    var testRoutes = proxyquire(path.resolve('routes', 'DEFAULT', '___Test_test'), proxy)
    // init and invoke all methods
    testRoutes({
      app: {
        get: test
      }
    })
  })
})
