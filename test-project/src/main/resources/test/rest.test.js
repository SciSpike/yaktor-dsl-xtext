/* global describe, it, before, beforeEach, afterEach */
var path = require('path')
var assert = require('assert')
var yaktor = require('yaktor')

describe(path.basename(__filename), function () {
  it('should be able to import routes', function () {
    require(path.resolve('rest','DEFAULT','test','Test'))
  })
})