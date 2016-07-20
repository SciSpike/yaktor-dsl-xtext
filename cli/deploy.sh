#!/usr/bin/env bash
set -ex

echo "Determining deployment coordinates:"

CLI_DIR="${CLI_DIR:-.}"
echo "CLI_DIR=$CLI_DIR"
MAVEN_SETTINGS="${MAVEN_SETTINGS:-$HOME/.m2/settings.xml}"
echo "MAVEN_SETTINGS=$MAVEN_SETTINGS"
TARGET=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.build.directory | egrep -v '^\[.*' | xargs)
echo "TARGET=$TARGET"
VERSION=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs)
echo "VERSION=$VERSION"
ARTIFACT_ID=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.artifactId | egrep -v '^\[.*' | xargs)
echo "ARTIFACT_ID=$ARTIFACT_ID"
GROUP_ID=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.groupId | egrep -v '^\[.*' | xargs)
echo "GROUP_ID=$GROUP_ID"
REPOSITORY_ID=${REPOSITORY_ID:-ossrh}
echo "REPOSITORY_ID=$REPOSITORY_ID"
POM="${POM:-$CLI_DIR/pom.xml}"
echo "POM=$POM"
if [[ "$VERSION" =~ ^[0-9]+\.[0-9]+\.[0-9]+\-SNAPSHOT$ ]]; then
  DEFAULT_REPOSITORY_URL='https://oss.sonatype.org/content/repositories/snapshots'
elif [[ "$VERSION" =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
  DEFAULT_REPOSITORY_URL='https://oss.sonatype.org/service/local/staging/deploy/maven2'
else
  echo "Badly formatted version: $VERSION"
  exit 1
fi
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
  PASS="$(mvn help:evaluate -f "$CLI_DIR" "--settings=$MAVEN_SETTINGS" -Dexpression=gpg.passphrase | egrep -v '^\[.*' | xargs)"
fi
echo "Coordinates done got gotten!"

if [ ! -f "$ARTIFACT" ]; then
  echo "Building due to missing $ARTIFACT"
  mvn clean install
fi

mvn gpg:sign-and-deploy-file \
  -P release \
  "--settings=$MAVEN_SETTINGS" \
  "-Durl=$REPOSITORY_URL" \
  "-DrepositoryId=$REPOSITORY_ID" \
  "-Dfile=$ARTIFACT" \
  "-DpomFile=$POM" \
  "-DgeneratePom=false" \
  "-Djavadoc=$JAVADOC_ARTIFACT" \
  "-Dsources=$SOURCES_ARTIFACT" \
  "-Dgpg.passphrase=$PASS"
