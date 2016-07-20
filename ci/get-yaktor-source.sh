#!/usr/bin/env bash -ev

YAKTOR_VERSION="${VERSION:-0.3.0}"
YAKTOR_DIR="${YAKTOR_DIR:-~/.yaktor}"

mkdir -p "$YAKTOR_DIR"
curl -L https://github.com/SciSpike/yaktor/archive/v$YAKTOR_VERSION.zip > "$YAKTOR_DIR/yaktor.zip"
unzip "$YAKTOR_DIR/yaktor.zip" -d "$YAKTOR_DIR"
