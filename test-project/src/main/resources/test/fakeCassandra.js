var noOpExecute = function (query, data, cb) {
  cb()
}
var fakeClient = {
  execute: noOpExecute
}
var path = require('path')
require(path.resolve('node_modules', 'node-cassandra-cql')).client = fakeClient

module.exports = {
  client: fakeClient,
  noOpExecute: noOpExecute
}
