#!/usr/bin/env bash
set -e

CLI_DIR=${CLI_DIR:-./cli}

openssl enc -aes-256-cbc -d -in "$CLI_DIR/signingkey.asc.x" -out "$CLI_DIR/signingkey.asc" -base64 -K $TRAVIS_GPG_KEY -iv $TRAVIS_GPG_IV
gpg --fast-import "$CLI_DIR/signingkey.asc"
