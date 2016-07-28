/* global describe, it */
var path = require('path')
var mongoose = require('mongoose')
var proxyquire = require('proxyquire')
function Global (m) {
  m[ '@noCallThru' ] = true
  m[ '@runtimeGlobal' ] = true
  return m
}

var types = {}
var mockConverter = {
  registerType: function (t,type) {
    types[t]=type
  },
  Field: function (name, name2, kind, type) {
    this.name = name
    this.type = type
  },
  Type: function (name, fields, meta) {
    this.name = name
    this.fields = fields
    this.meta - meta
  }
}

var proxy = {
  'yaktor/services/conversionService': Global({}),
  'yaktor/services/Response': Global({}),
  'mongoose': Global(mongoose)
}

describe(path.basename(__filename), function () {
  it('should be able to import routes', function () {
    proxyquire(path.resolve('rest', 'DEFAULT', 'test', 'Test'), proxy)
  })
})
