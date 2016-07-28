/* global describe, it */
var path = require('path')
var mongoose = require('mongoose')
var proxyquire = require('proxyquire')
var assert = require('assert')
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
    this.meta = meta
  }
}

var proxy = {
  'yaktor/services/conversionService': Global(mockConverter),
  'mongoose': Global(mongoose)
}

describe(path.basename(__filename), function () {
  it('should import all types', function () {
    proxyquire(path.resolve('conversations', 'types'), proxy)
    assert.ok(types['Test.B'])
    assert.ok(types['Test.B'].meta.hasId)
    assert.ok(types['Test.B'].meta.keys.id)
    assert.ok(types['Test.B'].fields)
    assert.ok(types['Test.B'].fields[0])
    assert.equal(types['Test.B'].fields[0].name,'a')
    assert.equal(types['Test.B'].fields[1].name,'b')
    assert.equal(types['Test.B'].fields[2].name,'id')
  })
})
