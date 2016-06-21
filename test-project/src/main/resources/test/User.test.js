/* global describe, it, before, beforeEach, afterEach */
var path = require('path')
var assert = require('assert')
var yaktor = require('yaktor')
var converter = require('yaktor/app/services/conversionService')
var async = require('async')

var User = null

describe(path.basename(__filename), function () {
  before(function (done) {
    require('./mongoCfg')(function () {
      var mongoose = require('mongoose')
      User = mongoose.model('User')
      done()
    })
  })

  describe('CRUD', function () {
    beforeEach(function (done) {
      async.parallel([
        function (cb) {
          var u = { 'name': 'abc', 'email': 'a@b.com' }
          converter.fromDto('UserUnitTest.User', u, function (err, user) {
            assert.ifError(err)
            user.save(cb)
          })
        },
        function (cb) {
          var h = { '_id': '000000000000000000000101', 'street': 'foo' }
          converter.fromDto('UserUnitTest.House', h, function (err, house) {
            assert.ifError(err)
            house.save(cb)
          })
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
      var query = {'email': 'a@b.com'}
      // The following "name" query works
      // var query = {"name":"abc"}
      async.waterfall([
        async.apply(converter.toQuery, 'UserUnitTest.User', query),
        function (pQ, cb) {
          var page = 1
          var pageSize = 10
          User.find(pQ).paginate(page, pageSize, cb)
        },
        function (domains, total, cb) {
          converter.to('UserUnitTest.User', domains, function (err, dtos) {
            cb(err, dtos, total)
          })
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
        async.apply(User.findOne.bind(User), {_id: id}),
        async.apply(converter.to, 'UserUnitTest.User')
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
        async.apply(converter.from, 'UserUnitTest.User', body),
        function (domain, cb) {
          User.findOneAndUpdate({_id: id}, domain, {new: true}, cb)
        },
        async.apply(converter.to, 'UserUnitTest.User') //
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
      var body = { 'email': 'foo@bar.com', 'name': 'foobar' }

      async.waterfall([
        async.apply(converter.from, 'UserUnitTest.User', body),
        async.apply(User.create.bind(User)),
        async.apply(converter.to, 'UserUnitTest.User')
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
        async.apply(converter.from, 'UserUnitTest.User', body),
        function (domain, cb) {
          User.findOneAndUpdate({_id: id}, domain, {new: true}, cb)
        },
        async.apply(converter.to, 'UserUnitTest.User') //
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'a@b.com')
        assert.equal(result.name, 'abc')
        assert.equal(result.email, 'a@b.com')
        assert.equal(result.house, '000000000000000000000101')
        done()
      })
    })

    it('update with nested object 2', function (done) {
      var id = 'a@b.com'
      var body = { 'house': {'_id': '000000000000000000000101'} }

      async.waterfall([
        async.apply(converter.from, 'UserUnitTest.User', body),
        function (domain, cb) {
          User.findOneAndUpdate({_id: id}, domain, {new: true}, cb)
        },
        async.apply(converter.to, 'UserUnitTest.User') //
      ], function (err, result) {
        assert.ifError(err)
        assert.equal(result._id, 'a@b.com')
        assert.equal(result.name, 'abc')
        assert.equal(result.email, 'a@b.com')
        assert.equal(result.house, '000000000000000000000101')
        done()
      })
    })
  })
})
