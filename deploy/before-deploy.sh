#!/usr/bin/env bash

DIR=${DIR:-./deploy}

if [ "$TRAVIS_PULL_REQUEST" == 'true' ]; then
  exit 0
fi

if [ "$TRAVIS_BRANCH" = 'master' ] | [[ "$TRAVIS_BRANCH" =~ [0-9]+\.[0-9]+\.x ]]; then # on master or maintenance branch
  openssl aes-256-cbc -K "$encrypted_ff7df2c82614_key" -iv "$encrypted_ff7df2c82614_iv" -in "$DIR/signingkey.asc.enc" -out "$DIR/signingkey.asc" -d
  gpg --fast-import "$DIR/signingkey.asc"
fi
