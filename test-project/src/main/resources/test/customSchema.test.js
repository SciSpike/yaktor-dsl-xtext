/* global describe, it */
var assert = require('assert')
var path = require('path')
var mongoose = require('mongoose')
require(path.resolve('src-gen', 'modelAll'))
describe(path.basename(__filename), function () {
  it('should be able to invoke the custom instance mentod test on a', function () {
    var A = mongoose.model('A')
    var s = 's'
    var b = 'b'
    var a = new A({a: s})
    assert.ok(a.test)
    a.test(b)
    assert.equal(a.a, b)
  })
})
