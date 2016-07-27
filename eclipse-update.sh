#!/usr/bin/env bash

if [ -z "$VERSION" ]; then
  VERSION=$(mvn -f "$(dirname $0)" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # get "downloading" messages out of the way
  export VERSION=$(mvn -f "$(dirname $0)" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # now egrep will work
fi
echo "VERSION=$VERSION"

# auth
AWS_DIR=${AWS_DIR:-$HOME/.aws}
mkdir -p "$AWS_DIR"
CREDENTIALS="${CREDENTIALS:-$AWS_DIR/credentials}"
touch "$CREDENTIALS"
chmod go-rwx "$CREDENTIALS"
cat <<EOF >> "$CREDENTIALS"
[scispike]
aws_access_key_id=$AWS_ACCESS_KEY_ID
aws_secret_access_key=$AWS_SECRET_ACCESS_KEY
EOF

# go!
npm install
composite/site.js --sites $VERSION
composite/upload.sh
