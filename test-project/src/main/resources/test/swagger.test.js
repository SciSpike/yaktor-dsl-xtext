/* global describe, it */
var SwaggerParser = require('swagger-parser')
var path = require('path')
var server = {
  urlPrefix: 'http://host',
  host: {
    proto: 'http',
    port: '80',
    hostname: 'host'
  }
}
describe(path.basename(__filename), function () {
  describe('valid schema', function () {
    it('should be produced by generator, after replacing <%= %>', function () {
      var schema = require(path.resolve('public', 'swagger_api', 'DEFAULT', 'Test.json'))
      var host = server.host
      schema.schemes = [server.host.proto]
      schema.host = host.hostname + ':' + host.port
      var implicit = schema.securityDefinitions.implicit
      if (implicit) {
        implicit.authorizationUrl = implicit.authorizationUrl.replace(/<%=proto %>:\/\/<%=host %>/, server.urlPrefix)
      }
      var password = schema.securityDefinitions.password
      if (password) {
        password.tokenUrl = password.tokenUrl.replace(/<%=proto %>:\/\/<%=host %>/, server.urlPrefix)
      }
      return SwaggerParser.validate(schema)
    })
  })
})
