#!/usr/bin/env bash
set -e

TRAVIS_GPG_KEY_ENVVAR=${TRAVIS_GPG_KEY_ENVVAR:-TRAVIS_GPG_KEY}
TRAVIS_GPG_IV_ENVVAR=${TRAVIS_GPG_IV_ENVVAR:-TRAVIS_GPG_IV}
SIGNING_KEY_FILE="${SIGNING_KEY_FILE:-signingkey.asc}"
if [ -f "$SIGNING_KEY_FILE" ]; then
  echo "File exists: $SIGNING_KEY_FILE" >&2
  exit 1
fi
GPG_KEY_NAME="$GPG_KEY_NAME"
if [ -z "$GPG_KEY_NAME" ]; then
  read -p "Enter gpg key name/id: " GPG_KEY_NAME
fi
GPG_KEY_PASSPHRASE="$GPG_KEY_PASSPHRASE"
if [ -z "$GPG_KEY_PASSPHRASE" ]; then
  read -s -p "Enter gpg key passphrase: " GPG_KEY_PASSPHRASE
  echo ''
fi
gpg --export --armor "$GPG_KEY_NAME" > "$SIGNING_KEY_FILE"
echo "$GPG_KEY_PASSPHRASE" | \
    gpg --passphrase-fd 0 --batch --no-tty --yes --export-secret-keys --armor "$GPG_KEY_NAME" \
    >> "$SIGNING_KEY_FILE"
TRAVIS_GPG_KEY=$(uuidgen | sed -E 's,\-,,g')
TRAVIS_GPG_IV=$(uuidgen | sed -E 's,\-,,g')
TRAVIS_GPG_IV=${TRAVIS_GPG_IV:0:16}
OUTFILE="$SIGNING_KEY_FILE.x"
if [ -f "$OUTFILE" ]; then
  echo "File exists: $OUTFILE" >&2
  exit 2
fi
openssl enc -aes-256-cbc -e -in "$SIGNING_KEY_FILE" -out "$OUTFILE" -base64 -K $TRAVIS_GPG_KEY -iv $TRAVIS_GPG_IV
rm "$SIGNING_KEY_FILE"
TRAVIS_YML_KEY=$(travis encrypt --no-interactive --org "${TRAVIS_GPG_KEY_ENVVAR}=${TRAVIS_GPG_KEY}")
TRAVIS_YML_IV=$(travis encrypt --no-interactive --org "${TRAVIS_GPG_IV_ENVVAR}=${TRAVIS_GPG_IV}")
cat <<EOL
OK
Add the following to your .travis.yml

- secure: $TRAVIS_YML_KEY

- secure: $TRAVIS_YML_IV

Decryption command:
openssl enc -aes-256-cbc -d -in "$OUTFILE" -out "$SIGNING_KEY_FILE" -base64 -K \$$TRAVIS_GPG_KEY_ENVVAR -iv \$$TRAVIS_GPG_IV_ENVVAR

Remember to
git add $OUTFILE
EOL
