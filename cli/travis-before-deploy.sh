#!/usr/bin/env bash
set -e

CLI_DIR=${CLI_DIR:-./cli}

openssl aes-256-cbc -K $encrypted_a314b1bbacc4_key -iv $encrypted_a314b1bbacc4_iv -in "$CLI_DIR/signingkey.asc.enc" -out "$CLI_DIR/signingkey.asc" -d
gpg --fast-import "$CLI_DIR/signingkey.asc"
