#!/usr/bin/env bash -e

CURRENT=$(mvn help:evaluate -Dexpression=project.version -N | egrep -v '(^\[.*)' | xargs)
if [[ ! $CURRENT =~ \-SNAPSHOT$ ]]; then
  echo "ERROR: $CURRENT is NOT a snapshot; borking..." >&2
  exit 1
fi

NEXT=$(echo $CURRENT | sed -E 's/\-SNAPSHOT//g')
CURRENT_SED=$(echo -n $NEXT | sed -E 's/\./\\./g')
set -x
find . -name site.xml | xargs -n 1 sed -i.drop -E "s/${CURRENT_SED}\\.qualifier/$NEXT/g"
find . -name MANIFEST.MF | xargs -n 1 sed -i.drop -E "s/Bundle\\-Version: ${CURRENT_SED}\\.qualifier/Bundle\\-Version: ${NEXT}/g"
find . -name feature.xml | xargs -n 1 sed -i.drop -E "s/version=\"${CURRENT_SED}\\.qualifier/version=\"${NEXT}/g"
find . -name *.drop | xargs rm
mvn org.codehaus.mojo:versions-maven-plugin:2.1:set \
  -N \
  -DgenerateBackupPoms=false \
  -DnewVersion=${NEXT}
