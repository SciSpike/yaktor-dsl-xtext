var path = require('path')
var assert = require('assert')

assert.ok(require(path.resolve('public', 'api', 'Test', 'Test')), 'bad agent api')
assert.ok(require(path.resolve('public', 'swagger_api', 'Test', 'api.json')), 'bad swagger')
assert.ok(require(path.resolve('public', 'Test', 'views')), 'bad view.js')
