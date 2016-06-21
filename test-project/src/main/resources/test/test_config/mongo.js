var mongoose = require('mongoose')
var mockgoose = require('mockgoose')
mockgoose(mongoose)
var path = require('path')
console.log(__filename)
var mongoHost = process.env.MONGO_HOST || "localhost:27017"
/* jshint eqnull:true */
module.exports = function (cb) {
  console.log(this)
  require('mongoose-pagination')
  var f1nU = mongoose.Model.findOneAndUpdate
  // Monkey Patch for update existing doc.
  mongoose.Model.findOneAndUpdate = function (q, doc) {
    if (doc != null && doc.toObject != null) {
      var newDoc = doc.toObject()
      delete newDoc._id
      // This line may cause JSHint warning. However, it is an optimization that is safe.
      /* jshint ignore:start */
      arguments[1] = newDoc
      /* jshint ignore:end */
      f1nU.apply(this, arguments)
    } else {
      f1nU.apply(this, arguments)
    }
  }
  mongoose.connect('mongodb://'+mongoHost+'/TestingDB')
  cb()
}
