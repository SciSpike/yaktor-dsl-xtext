module.exports = function (schema) {
  schema.methods.test = function (s) {
    this.a = s
  }
}
