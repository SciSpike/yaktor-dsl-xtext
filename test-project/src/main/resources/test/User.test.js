/* global describe, it, before, beforeEach, afterEach */
var path = require('path')
var assert = require('assert')
var async = require('async')
var mongoose = require('mongoose')

var User = null
var House = null

describe(path.basename(__filename), function () {
  before(function (done) {
    require('./mongoCfg')(function () {
      var mongoose = require('mongoose')
      User = mongoose.model('User')
      House = mongoose.model('House')
      done()
    })
  })
 

  describe('CRUD', function () {
    beforeEach(function (done) {
      async.parallel([
        function (cb) {
          var u = { 'name': 'abc', '_id': 'a@b.com' }
          new User(u).save(cb)
        },
        function (cb) {
          var h = { '_id': '000000000000000000000101', 'street': 'foo' }
          new House(h).save(cb)
        }
      ], done)
    })

    afterEach(function (done) {
      var mockgoose = require('mockgoose')
      mockgoose.reset()
      done()
    })

    it('find', function (done) {
      // This should work but there is a bug due to the 'email' field being a Mongoose virtual
      var query = {'_id': 'a@b.com'}
      // The following "name" query works
      // var query = {"name":"abc"}
      async.waterfall([
        function (pQ, cb) {
          var page = 1
          var pageSize = 10
          User.find(pQ).paginate(page, pageSize, cb)
        }
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result.length, 1)
        assert.equal(result[0]._id, 'a@b.com')
        assert.equal(result[0].name, 'abc')
        assert.equal(result[0].email, 'a@b.com')
        done()
      })
    })

    it('read', function (done) {
      var id = 'a@b.com'
      async.waterfall([
        async.apply(User.findOne.bind(User), {_id: id}) //
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'a@b.com')
        assert.equal(result.name, 'abc')
        assert.equal(result.email, 'a@b.com')
        done()
      })
    })

    it('update', function (done) {
      var id = 'a@b.com'
      var body = { 'name': 'bob' }

      async.waterfall([
        function (cb) {
          User.findOneAndUpdate({_id: id}, body, {new: true}, cb)
        } //
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'a@b.com')
        assert.equal(result.name, 'bob')
        assert.equal(result.email, 'a@b.com')
        done()
      })
    })

    it('delete', function (done) {
      var id = 'a@b.com'
      User.remove({_id: id}, function (err) {
        assert.ifError(err)
        User.findOne(id, function (err, user) {
          assert.ifError(err)
          assert.equal(user, null)
          done()
        })
      })
    })

    it('create', function (done) {
      var body = { '_id': 'foo@bar.com', 'name': 'foobar' }

      async.waterfall([
        async.apply(User.create.bind(User),body)
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'foo@bar.com')
        assert.equal(result.name, 'foobar')
        assert.equal(result.email, 'foo@bar.com')
        User.remove({_id: 'foo@bar.com'}, function (err) {
          assert.ifError(err)
        })
        done()
      })
    })

    it('update with nested object', function (done) {
      var id = 'a@b.com'
      var body = { 'house': '000000000000000000000101' }

      async.waterfall([
        function (cb) {
          User.findOneAndUpdate({_id: id}, body, {new: true}, cb)
        } //
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'a@b.com')
        assert.equal(result.email, 'a@b.com')
        assert.equal(result.name, 'abc')
        assert.equal(result.house, '000000000000000000000101')
        done()
      })
    })

    it('update with nested object 2', function (done) {
      var id = 'a@b.com'
      var body = { 'house': {'_id': '000000000000000000000101'} }

      async.waterfall([
        function ( cb) {
          User.findOneAndUpdate({_id: id}, body, {new: true}, cb)
        } //
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'a@b.com')
        assert.equal(result.email, 'a@b.com')
        assert.equal(result.name, 'abc')
        assert.equal(result.house, '000000000000000000000101')
        done()
      })
    })
  })
})
