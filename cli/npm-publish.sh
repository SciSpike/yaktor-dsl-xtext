#!/usr/bin/env bash

# npm auth
if [ -n "$NPM_AUTH_TOKEN" ]; then
  echo "$NPM_AUTH_TOKEN" > ~/.npmrc
  chmod go-rwx ~/.npmrc
fi
set -x
TARGET=${TARGET:-.}
if [ -z "$VERSION" ]; then
  VERSION=$(mvn -f "$TARGET/../../" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # get "downloading" messages out of the way, if any
  VERSION=$(mvn -f "$TARGET/../../" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # now egrep will work
fi
NPM_VERSION="$VERSION"
if [[ "$NPM_VERSION" =~ /\-SNAPSHOT$/ ]]; then # translate -SNAPSHOT to -pre.YYYYmmddHHMMSS
  if [ -z "$INSTANT" ]; then
    INSTANT=$(date --utc +%Y%m%d%H%M%S)
  fi
  SUFFIX="-pre.$INSTANT"
  NPM_VERSION=$(echo -n "$NPM_VERSION" | sed -E "s,\\-SNAPSHOT$,$SUFFIX,g")
  find "$TARGET" -name package.json | xargs sed -i.SNAPSHOT -E "s,\\-SNAPSHOT,$SUFFIX,g"
  rm -f "$TARGET/package.json.SNAPSHOT"
fi
npm publish "$TARGET" --tag "$NPM_VERSION"
