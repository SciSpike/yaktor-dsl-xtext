#!/usr/bin/env bash -ev

NODE_VERSION=${NODE_VERSION:-4.4}

nvm install $NODE_VERSION
nvm use $NODE_VERSION
