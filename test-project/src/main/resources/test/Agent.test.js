/* global describe, it */
var path = require('path')
var assert = require('assert')
var mongoose = require('mongoose')
var ShortId = require('mongoose-shortid-nodeps') 
var mockgoose = require('mockgoose')
mockgoose(mongoose)
require(path.resolve('src-gen', 'modelAll'))
describe('Agent', function () {
  describe('Test.Test', function () {
    it('should be loaded', function () {
      var test = require(path.resolve('conversations', 'js', 'Test'))
      assert.ok(test.agents['Test.Test'])
      assert.ok(test.agents['Test.Test'].states)
      assert.ok(test.agents['Test.Test'].states.working)
      assert.ok(test.agents['Test.Test'].states.working.transitions)
      assert.ok(test.agents['Test.Test'].states.working.transitions.finished)
      assert.ok(test.agents['Test.Test'].states.working.transitions.finished.to)
      assert.equal(test.agents['Test.Test'].states.working.transitions.finished.to, test.agents['Test.Test'].states.done)
      assert.ok(test.agents['Test.TestDepend'])
    })
  })
  describe('UserUnitTest.Test.Test', function () {
    it('should be loaded', function () {
      var Test = require(path.resolve('conversations', 'js', 'Test'))
      var UserUnitTest = require(path.resolve('conversations', 'js', 'UserUnitTest'))
      assert.ok(Test.agents['Test.Test'])
      assert.ok(UserUnitTest.agents['Test.Test'])
      assert.equal(UserUnitTest.agents['Test.Test'], Test.agents['Test.Test'])
    })
  })
})
