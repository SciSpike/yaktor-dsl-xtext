var assert = require('assert')
var path = require('path')
var async = require('async')
var mongoose = require('mongoose')
require('mongoose-shortid-nodeps')
var mockgoose = require('mockgoose')
mockgoose(mongoose)
require(path.resolve('src-gen', 'modelAll'))
var All = mongoose.model('All')
var Ref = mongoose.model('Ref')
var Simple = mongoose.model('Simple')
var converter = require('yaktor/services/conversionService')
require(path.resolve('conversations', 'types'))
var Validation = mongoose.model('Validation')
var Validation2 = mongoose.model('Validation2')
describe('domain', function () {
  after('config', function (done) {
    mockgoose.reset()
    done()
  })
  describe('Validation', function () {
    it('should have no errors', function () {
      new Validation({
        hidden: '!@#SD^YGBHU*87trf765rfghyt',
        patterned: 'pattern',
        ranged1: 1,
        ranged2: 2,
        ranged3: 3,
        ranged4: 4,
        lengthed: '!@',
        patterndLength1: 'ab',
        patterndLength2: 'ab',
        required: 'f',
        t: {a: 'value'},
        ts: [{a: 'value'}],
        valued: 'One'
      }).save(function (err) {
        assert.ifError(err)
      })
    })
    it('should throw with a [{type}]', function () {
      new Validation({
        ts: [{}],
      }).save(function (err) {
        assert.ok(err)
        assert.ok(err.errors)
        assert.ok(Object.keys(err.errors).length)
        assert.equal(err.errors['ts.0.a'].kind, 'required')
      })
    })
    it('should throw with a [{nest:[{type}]}]', function () {
      new Validation({
        ts: [{a: 'value',tts: [{}]}],
      }).save(function (err) {
        assert.ok(err)
        assert.ok(err.errors)
        assert.ok(Object.keys(err.errors).length)
        assert.equal(err.errors['ts.0.tts.0.aa'].kind, 'required')
      })
    })
    it('should throw with a [{nest:{type}}]', function () {
      new Validation({
        ts: [{a: 'value',tt: {}}],
      }).save(function (err) {
        assert.ok(err)
        assert.ok(err.errors)
        assert.ok(Object.keys(err.errors).length)
        assert.equal(err.errors['ts.0.tt.aa'].kind, 'required', JSON.stringify(err.errors, null, 2))
      })
    })
    it('should throw with a {nest:{type}}', function () {
      new Validation2({
        tt: {},
      }).save(function (err) {
        assert.ok(err)
        assert.ok(err.errors)
        assert.ok(Object.keys(err.errors).length)
        assert.equal(err.errors['tt.aa'].kind, 'required', JSON.stringify(err.errors, null, 2))
      })
    })
    it('should throw with all nested errors', function () {
      new Validation({
        _id: 'notAnObjectId',
        patterned: 'invalid',
        ranged1: 0,
        ranged2: 3,
        ranged3: 2,
        ranged4: 5,
        lengthed: '!@#',
        patterndLength1: '12',
        patterndLength2: 'abc',
        valued: 'invalid',
        t: {}
      }).save(function (err) {
        assert.ok(err)
        assert.ok(err.errors)
        var get = function (rrs, err) {
          var a = rrs[err]
          delete rrs[err]
          return a
        }
        assert.equal(get(err.errors, '_id').kind, 'ObjectID')
        assert.equal(get(err.errors, 'hidden').kind, 'required')
        assert.equal(get(err.errors, 'patterned').kind, 'regexp')
        assert.equal(get(err.errors, 'ranged1').kind, 'min')
        assert.equal(get(err.errors, 'ranged2').kind, 'max')
        assert.equal(get(err.errors, 'ranged3').kind, 'min')
        assert.equal(get(err.errors, 'ranged4').kind, 'max')
        assert.equal(get(err.errors, 'lengthed').kind, 'regexp')
        assert.equal(get(err.errors, 'patterndLength1').kind, 'regexp')
        assert.equal(get(err.errors, 'patterndLength2').kind, 'regexp')
        assert.equal(get(err.errors, 'required').kind, 'required')
        assert.equal(get(err.errors, 'valued').kind, 'enum')
        assert.equal(get(err.errors, 't.a').kind, 'required')
        assert.equal(Object.keys(err.errors).length, 0, JSON.stringify(err.errors, null, 2))
      })
    })
  })
  describe('WithId', function () {
    it('should get an Id when saved', function (done) {
      new mongoose.model('WithId')({}).save(function (err, withId) {
        assert.ifError(err)
        assert.ok(withId._id)
        done()
      })
    })
  })
  describe('Ref', function () {
    it('should crud', function (done) {
      var ref = {
        a: 'a',
        i: {
          a: 'a'
        }
      }

      var i = new Simple(ref.i)
      async.waterfall([
        async.apply(Simple.create.bind(Simple), i),
        function (i, cb) {
          ref.i = i._id
          cb(null, ref)
        },
        async.apply(converter.fromDto, 'Test.TestRef'),
        async.apply(Ref.create.bind(Ref)),
        function (domain, cb) {
          Ref.findOne({_id: domain._id}).exec(cb)
        },
        function (domain, cb) {
          assert.equal(ref.a, domain.a)
          assert.equal(ref.i.toString(), domain.i.toString())
          cb()
        },
      ], done)
    })
  })
  describe('All', function () {
    it('should crud', function (done) {
      var a = {
        a: 1.2,
        a2: {},
        b: true,
        c: 1,
        d: new Date(),
        e: '1',
        g: [ 1, 2 ],
        i: '123456789012123456789012',
        i2: 1,
        n: 12.345,
        p: 12.34,
        r: '123456789012123456789012',
        s2: 'string',
        t: {
          a: 'a'
        },
        // no twt because it's optional
        // no ts because collection can have zero elements
        moreTs: [{
          a: 'moreT'
        }]
      }
      new All(a).save(function (err, all) {
        assert.ifError(err)
        assert.equal(all.a, a.a)
        assert.ok(all.s)
        assert.ok(/^[0-9]{6}$/.test(all.s), 'should be /^[0-9]{6}$/')
        assert.ok(!all.twt)
        assert.ok(!all.ts.length)
        assert.ok(all.moreTs[0])
        All.findOne({
          _id: all._id
        }, function (err, all) {
          assert.ifError(err)
          assert.equal(all.a, a.a)
          assert.ok(all.s)
          All.findOneAndUpdate({
            _id: all._id
          }, {
            s: '234'
          }, function (err) {
            assert.ifError(err)
            All.remove({
              _id: all._id
            }, function (err) {
              assert.ifError(err)
              All.findOne({
                _id: all._id
              }, function (err, all) {
                assert.ifError(err)
                assert.ok(!all)
                done()
              })
            })
          })
        })
      })
    })
  })
})
