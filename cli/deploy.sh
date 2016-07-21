#!/usr/bin/env bash
set -e

echo "Determining deployment coordinates:"

VERSION=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # get "downloading" messages out of the way
VERSION=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # now egrep will work
echo "VERSION=$VERSION"
if [[ "$VERSION" =~ ^[0-9]+\.[0-9]+\.[0-9]+\-SNAPSHOT$ ]]; then
  SNAPSHOT=1
  DEFAULT_REPOSITORY_URL='https://oss.sonatype.org/content/repositories/snapshots'
elif [[ "$VERSION" =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
  DEFAULT_REPOSITORY_URL='https://oss.sonatype.org/service/local/staging/deploy/maven2'
else
  echo "Badly formatted version: $VERSION"
  exit 1
fi
CLI_DIR="${CLI_DIR:-.}"
echo "CLI_DIR=$CLI_DIR"
MAVEN_SETTINGS="${MAVEN_SETTINGS:-$HOME/.m2/settings.xml}"
echo "MAVEN_SETTINGS=$MAVEN_SETTINGS"
TARGET="$CLI_DIR/target"
#TARGET=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.build.directory | egrep -v '^\[.*' | xargs) # overkill
echo "TARGET=$TARGET"
ARTIFACT_ID=xtext-dsl-cli
#ARTIFACT_ID=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.artifactId | egrep -v '^\[.*' | xargs) # overkill
echo "ARTIFACT_ID=$ARTIFACT_ID"
GROUP_ID=io.yaktor
#GROUP_ID=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.groupId | egrep -v '^\[.*' | xargs) # overkill
echo "GROUP_ID=$GROUP_ID"
REPOSITORY_ID=${REPOSITORY_ID:-ossrh}
echo "REPOSITORY_ID=$REPOSITORY_ID"
POM="${POM:-$CLI_DIR/pom.xml}"
echo "POM=$POM"
REPOSITORY_URL=${REPOSITORY_URL:-$DEFAULT_REPOSITORY_URL}
echo "REPOSITORY_URL=$REPOSITORY_URL"
if [ -z "$ARTIFACT" ]; then
  ARTIFACT="$TARGET/yaktor-$ARTIFACT_ID-light.jar"
fi
echo "ARTIFACT=$ARTIFACT"
if [ -z "$JAVADOC_ARTIFACT" ]; then
  JAVADOC_ARTIFACT="$TARGET/$ARTIFACT_ID-$VERSION-javadoc.jar"
fi
echo "JAVADOC_ARTIFACT=$JAVADOC_ARTIFACT"
if [ -z "$SOURCES_ARTIFACT" ]; then
  SOURCES_ARTIFACT="$TARGET/$ARTIFACT_ID-$VERSION-sources.jar"
fi
echo "SOURCES_ARTIFACT=$SOURCES_ARTIFACT"
if [ -z "$PASS" ]; then
  PASS="$(mvn help:evaluate -f "$CLI_DIR" "--settings=$MAVEN_SETTINGS" -Dexpression=gpg.passphrase | egrep -v '^\[.*' | xargs)" # get "downloading" messages out of the way
  PASS="$(mvn help:evaluate -f "$CLI_DIR" "--settings=$MAVEN_SETTINGS" -Dexpression=gpg.passphrase | egrep -v '^\[.*' | xargs)" # now egrep will work
fi
echo "Coordinates done got gotten!"

if [ ! -f "$ARTIFACT" ]; then
  echo "WARNING: missing $ARTIFACT"
  exit 2
fi

mvn gpg:sign-and-deploy-file \
  -P release \
  --settings="$MAVEN_SETTINGS" \
  -Durl="$REPOSITORY_URL" \
  -DrepositoryId=$REPOSITORY_ID \
  -Dfile=$ARTIFACT \
  -DpomFile="$POM" \
  -DgeneratePom=false \
  -Djavadoc="$JAVADOC_ARTIFACT" \
  -Dsources="$SOURCES_ARTIFACT" \
  -Dgpg.passphrase="$PASS"

if [ -N "$SNAPSHOT" ]; then
  exit 0
fi

# else staged; now close & release
