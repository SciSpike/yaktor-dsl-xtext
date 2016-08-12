#!/usr/bin/env bash
set -e

npm install coveralls
cat test-project/target/test-output/coverage/lcov.info | ./node_modules/coveralls/bin/coveralls.js