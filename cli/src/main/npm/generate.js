#!/usr/bin/env node
var args = process.argv.slice(2)
var path = require('path')
var cp = require('child_process')
var artifactId = '${project.artifactId}'
var version = '${project.version}'
var jar = [ artifactId, version ].join('-') + '.jar'
cp.spawn('java', [ '-jar', path.resolve(__dirname, jar) ].concat(args), { stdio: 'inherit' })
