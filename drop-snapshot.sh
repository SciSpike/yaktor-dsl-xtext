#!/usr/bin/env bash -e

CURRENT=$(mvn help:evaluate -Dexpression=project.version -N | egrep -v '(^\[.*)' | xargs)
if [[ ! $CURRENT =~ \-SNAPSHOT$ ]]; then
  echo "WARNING: $CURRENT is NOT a snapshot; borking..." >&2
  exit 1
fi

NEXT=$(echo $CURRENT | sed -E 's/\-SNAPSHOT//g')

set -x
mvn org.codehaus.mojo:versions-maven-plugin:2.1:set \
  -N \
  -DgenerateBackupPoms=false -DnewVersion=${NEXT}
