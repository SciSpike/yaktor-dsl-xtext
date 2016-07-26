#!/usr/bin/env bash

# npm auth
echo "$NPM_AUTH_TOKEN" > ~/.npmrc
set -x
chmod go-rwx ~/.npmrc
NPM_VERSION="$VERSION"
if [[ "$NPM_VERSION" =~ /\-SNAPSHOT$/ ]]; then # translate -SNAPSHOT to -pre.YYYYmmddHHMMSS
  SUFFIX="-pre.$INSTANT"
  NPM_VERSION=$(echo -n "$NPM_VERSION" | sed -E "s,\\-SNAPSHOT$,$SUFFIX,g")
  find "$TARGET/npm" -name package.json | xargs sed -i.SNAPSHOT -E "s,\\-SNAPSHOT,$SUFFIX,g"
  rm -f "$TARGET/npm/package.json.SNAPSHOT"
fi
npm publish "$TARGET/npm" --tag "$NPM_VERSION"
