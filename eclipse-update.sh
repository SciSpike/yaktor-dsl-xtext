#!/usr/bin/env bash
set -ex

# build the update site
VERSION=$(cd $(dirname $0)/conversation/update.all.tmpl && npm install && node build-update-site.js)

# config & auth
AWS_CONFIG_SECTION=${AWS_CONFIG_SECTION:-default}
AWS_CONFIG_REGION=${AWS_CONFIG_REGION:-us-west-2}
AWS_CONFIG_OUTPUT=${AWS_CONFIG_OUTPUT:-json}
AWS_DIR=${AWS_DIR:-$HOME/.aws}
AWS_CONFIG_FILE="${AWS_CONFIG_FILE:-$AWS_DIR/config}"
if [ ! -f "$AWS_CONFIG_FILE" ]; then
  mkdir -p "$AWS_DIR"
  cat <<EOF > "$AWS_CONFIG_FILE"
  [$AWS_CONFIG_SECTION]
  region = $AWS_CONFIG_REGION
  output = $AWS_CONFIG_OUTPUT
EOF
fi
AWS_CREDENTIALS_FILE="${AWS_CREDENTIALS_FILE:-$AWS_DIR/credentials}"
if [ ! -f "$AWS_CREDENTIALS_FILE" ]; then
  mkdir -p "$AWS_DIR"
  touch "$AWS_CREDENTIALS_FILE"
  chmod go-rwx "$AWS_CREDENTIALS_FILE"
  set +x
  AWS_CREDENTIALS_SECTION=${AWS_CREDENTIALS_SECTION:-scispike}
  cat <<EOF > "$AWS_CREDENTIALS_FILE"
  [$AWS_CREDENTIALS_SECTION]
  aws_access_key_id = $AWS_ACCESS_KEY_ID
  aws_secret_access_key = $AWS_SECRET_ACCESS_KEY
EOF
  set -x
fi

# get versions of all previously released update sites
AWS_S3_PATH=${AWS_S3_PATH:-yaktor.io/eclipse/} # trailing slash is necessary
EXISTING_VERSIONS=$(aws s3 ls $AWS_S3_PATH | egrep '/\s{0,}$' | awk '{print $2}' | sed 's,/$,,g' | tr '\n' ',' | sed 's/,$//g')
VERSIONS=$VERSION
if [ -n "$EXISTING_VERSIONS" ]; then
  VERSIONS=$EXISTING_VERSIONS,$VERSIONS
fi

# upload
npm install
composite/site.js --sites $VERSIONS
composite/upload.sh
