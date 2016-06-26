#!/usr/bin/env node
var _ = require("underscore");
var fs = require('fs');
var path = require('path');
var versions=require(path.resolve(__dirname,"versions.js"));
var content = _.template(fs.readFileSync(path.resolve(__dirname,"compositeContent._")).toString());
var artifacts = _.template(fs.readFileSync(path.resolve(__dirname,"compositeArtifacts._")).toString());
var upload = _.template(fs.readFileSync(path.resolve(__dirname,"upload._")).toString());
var ts = new Date().getTime();


function slice(val, memo) {
  memo =memo.concat(val.split(/\s/));
  return memo;
}


var program = require('commander')
program
  .version('0.0.1')
  .option('-s, --sites <sites>', 'Comma delimited list of versions to use of all available', function(s){return s.split(',')}, versions)
  .parse(process.argv)

console.log(process.argv, program.sites)

fs.writeFileSync(path.resolve(__dirname,"compositeContent.xml"),content({ts: ts,sites:program.sites}));
fs.writeFileSync(path.resolve(__dirname,"compositeArtifacts.xml"),artifacts({ts: ts,sites:program.sites}));
fs.writeFileSync(path.resolve(__dirname,"upload.sh"),upload({ts: ts,sites:program.sites}));


