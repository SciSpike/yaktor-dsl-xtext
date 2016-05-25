#!/usr/bin/env node
var _ = require('underscore')
var fs = require('fs')
var path = require('path')
var content = _.template(fs.readFileSync(path.resolve('compositeContent.xml')).toString())
var artifacts = _.template(fs.readFileSync(path.resolve('compositeArtifacts.xml')).toString())
var ts = new Date().getTime()

var program = require('commander')

function slice (val, memo) {
  memo = memo.concat(val.split(/\s/))
  return memo
}

program
  .version('0.0.1')
  .option('-s, --sites <sites>', 'Versions to use of all available', slice, [])
  .parse(process.argv)

console.log(process.argv, program.sites)

fs.writeFileSync(path.resolve('site', 'compositeContent.xml'), content({ts: ts, sites: program.sites}))
fs.writeFileSync(path.resolve('site', 'compositeArtifacts.xml'), artifacts({ts: ts, sites: program.sites}))
