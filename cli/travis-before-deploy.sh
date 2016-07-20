#!/usr/bin/env bash
set -e

CLI_DIR=${CLI_DIR:-./cli}

openssl aes-256-cbc -K "$encrypted_ff7df2c82614_key" -iv "$encrypted_ff7df2c82614_iv" -in "$CLI_DIR/signingkey.asc.enc" -out "$CLI_DIR/signingkey.asc" -d
gpg --fast-import "$CLI_DIR/signingkey.asc"
