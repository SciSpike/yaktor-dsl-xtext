/* global describe, it */
var path = require('path')
var assert = require('assert')
describe(path.basename(__filename), function () {
  it('it should properly encode the shortId regext', function () {
    var views = require(path.resolve('public', 'Test', 'views'))
    views.Test.crud.forEach(function (c) {
      if (c.name === 'c') {
        var p = c.actions.GET.type.properties
        assert.equal(p._id.pattern, '(\\w|[-]){1,6}')
        // wierd but what we expect
        assert.equal(p.y.pattern, '[(\\w)*]{1,14}')
        assert.equal(p.p.pattern, '(\\w)*')
      }
    })
  })
})
