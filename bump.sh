#!/usr/bin/env bash -e
INCREMENT=${1:-${INCREMENT:-patch}}
if [[ $INCREMENT =~ ^pre ]]; then
  echo "You can't use pre* with this script; we're speaking Maven here!" >&2
  exit 1
fi

npm install
CURRENT=$(mvn help:evaluate -Dexpression=project.version -N | egrep -v '^\[.*' | xargs)
if [[ $CURRENT =~ \-SNAPSHOT$ ]]; then
  SNAPSHOT="-SNAPSHOT"
  CURRENT=$(echo $CURRENT | sed -E 's/\-SNAPSHOT$//')
fi
NEXT=${VERSION-$(echo $CURRENT | xargs $(npm bin)/semver -i $INCREMENT)}
CURRENT_SED=$(echo -n $NEXT | sed -E 's/\./\\./g')
set -x
find . -name site.xml | xargs -n 1 sed -E -i.bump "s/(_){0,1}$CURRENT_SED(\.qualifier){0,1}(\.jar){0,1}/\\1$NEXT\\2\\3/g"
find . -name MANIFEST.MF | xargs -n 1 sed -E -i.bump "s/Bundle-Version: ${CURRENT_SED}(.qualifier){0,1}/Bundle-Version: ${NEXT}.qualifier/g"
find . -name feature.xml | xargs -n 1 sed -E -i.bump "s/version=\"${CURRENT_SED}(\.qualifier){0,1}/version=\"${NEXT}.qualifier/g"
find . -name '*.bump' | xargs rm
mvn org.codehaus.mojo:versions-maven-plugin:2.1:set \
  -N \
  -DgenerateBackupPoms=false \
  -DnewVersion=${NEXT}-SNAPSHOT \
  -DoldVersion=${CURRENT}${SNAPSHOT}
