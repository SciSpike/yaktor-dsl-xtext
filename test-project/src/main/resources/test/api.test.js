var path = require('path')
var assert = require('assert')

assert.ok(require(path.resolve('public', 'api', 'Test', 'Test')), 'bad agent api')
assert.ok(require(path.resolve('public', 'swagger_api', 'DEFAULT', 'Test.json')), 'bad swagger')
assert.ok(require(path.resolve('public', 'swagger_api', 'API', 'UserUnitTest.json')), 'bad swagger')
assert.ok(require(path.resolve('public', 'Test', 'views')), 'bad view.js')
