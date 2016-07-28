var path = require('path')
var fs = require('fs-extra')
var _ = require('lodash')
var proc = require('child_process')

var pkg = require(path.resolve(path.join(__dirname, '..', '..', 'package.json')))
var match = pkg.version.match(/^(\d+\.\d+\.\d+)(\-pre\.\d+)?$/)
var version = match[ 1 ]
var now = new Date()
var timestamp = now.getTime()
var qualifier = match[ 2 ] && now.toISOString().replace(/[\-T:\.Z]/g, '').substr(0, 12)
var params = { version, qualifier, timestamp }

var options = { 'interpolate': /<%=([\s\S]+?)%>/g }
var filename = _.template(fs.readFileSync(path.resolve('filename._')), options)
var size = _.template(fs.readFileSync(path.resolve('size._')), options)
var conversation = _.template(fs.readFileSync(path.resolve('conversation.feature.xml._')), options)
var domain = _.template(fs.readFileSync(path.resolve('domain.feature.xml._')), options)
var artifacts = _.template(fs.readFileSync(path.resolve('artifacts.xml._')), options)
var content = _.template(fs.readFileSync(path.resolve('content.xml._')), options)
var site = _.template(fs.readFileSync(path.resolve('site.xml._')), options)

var findFirstJarIn = function (dir) {
  return _.find(fs.readdirSync(dir), it => it.match(/\.jar$/))
}
var target = path.resolve('target')
var srcdir, dstdir, srcfile, dstfile, srcpath, dstpath
var sizes = {}

fs.removeSync(target)

;
[ 'features', 'plugins' ].forEach(it => fs.mkdirsSync(path.resolve(target, it)))

;
[ {
  type: 'conversation',
  dir: path.resolve('..'),
  feature: conversation
}, {
  type: 'domain',
  dir: path.resolve('..', '..', 'domain'),
  feature: domain
} ].forEach(it => {
  fs.writeFileSync(path.resolve(target, 'features', 'feature.xml'), it.feature(params))
  srcdir = path.resolve(it.dir, 'io.yaktor.' + it.type + '.cs.sdk', 'target')
  srcfile = findFirstJarIn(srcdir)
  dstfile = filename({ filename: srcfile, qualifier })
  dstdir = path.resolve(target, 'features')
  dstpath = path.resolve(dstdir, dstfile)
  proc.execSync('jar cfM ' + dstpath + ' -C ' + dstdir + ' feature.xml')
  sizes[ size({ dir: 'features', filename: srcfile }) ] = fs.statSync(dstpath).size
  fs.removeSync(path.resolve(dstdir, 'feature.xml'))

  ;
  [ 'as', 'cs', 'cs.ui' ].forEach(component => {
    srcdir = path.resolve(it.dir, 'io.yaktor.' + it.type + '.' + component, 'target')
    srcfile = findFirstJarIn(srcdir)
    if (!srcfile) throw new Error('no jar in ' + srcdir)
    srcpath = path.resolve(srcdir, srcfile)
    dstfile = filename({ filename: srcfile, qualifier })
    dstdir = path.resolve(target, 'plugins')
    dstpath = path.resolve(dstdir, dstfile)
    fs.copySync(srcpath, dstpath)
    console.error('component: ' + dstpath)
    var key = size({ dir: 'plugins', filename: srcfile })
    console.error('key: ' + key)
    var stat = fs.statSync(dstpath)
    console.error(stat)
    sizes[ key ] = stat.size
    console.error(sizes)
  })
})

dstfile = 'content.xml'
dstdir = target
dstpath = path.resolve(dstdir, dstfile)
fs.writeFileSync(dstpath, content(params))
proc.execSync('jar cfM ' + dstdir + '/content.jar -C ' + dstdir + ' ' + dstfile)
fs.removeSync(dstpath)

dstfile = 'artifacts.xml'
dstdir = target
dstpath = path.resolve(dstdir, dstfile)
_.assign(sizes, params)
console.error(sizes)
fs.writeFileSync(dstpath, artifacts(sizes))
proc.execSync('jar cfM ' + dstdir + '/artifacts.jar -C ' + dstdir + ' ' + dstfile)
fs.removeSync(dstpath)

dstfile = 'site.xml'
dstdir = target
dstpath = path.resolve(dstdir, dstfile)
fs.writeFileSync(dstpath, site(params))

// write the version to stdout
console.log(version + (qualifier ? ('.' + qualifier) : ''))
