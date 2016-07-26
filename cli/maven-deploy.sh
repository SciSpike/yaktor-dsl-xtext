#!/usr/bin/env bash
set -e

echo "Determining deployment coordinates:"

VERSION=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # get "downloading" messages out of the way
export VERSION=$(mvn -f "$CLI_DIR" help:evaluate -Dexpression=project.version | egrep -v '^\[.*' | xargs) # now egrep will work
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
REPOSITORY_URL=${REPOSITORY_URL:-$DEFAULT_REPOSITORY_URL}
echo "REPOSITORY_URL=$REPOSITORY_URL"
CLI_DIR="${CLI_DIR:-.}"
echo "CLI_DIR=$CLI_DIR"
MAVEN_SETTINGS="${MAVEN_SETTINGS:-$HOME/.m2/settings.xml}"
echo "MAVEN_SETTINGS=$MAVEN_SETTINGS"
export TARGET="$CLI_DIR/target"
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
echo "Coordinates done got gotten!"

if [ ! -f "$ARTIFACT" ]; then
  echo "ERROR: missing $ARTIFACT"
  exit 2
fi

set -x
mvn gpg:sign-and-deploy-file \
  -P release \
  --settings="$MAVEN_SETTINGS" \
  -Durl="$REPOSITORY_URL" \
  -DrepositoryId=$REPOSITORY_ID \
  -Dfile=$ARTIFACT \
  -DpomFile="$POM" \
  -DgeneratePom=false \
  -Djavadoc="$JAVADOC_ARTIFACT" \
  -Dsources="$SOURCES_ARTIFACT"
set +x

# if this is a SNAPSHOT build, then we're done
if [ -n "$SNAPSHOT" ]; then
  echo "INFO: Maven build successful; build is a SNAPSHOT: $VERSION"
  export INSTANT=$(date --utc +%Y%m%d%H%M%S)
  $(dirname $0)/npm-publish.sh
  exit 0
fi
# else this is a release & is now staged

# if release tag commit is not HEAD commit, bork
RELEASE_TAG_COMMIT=$(git show-ref -s --tags v$VERSION)
HEAD_COMMIT=$(git rev-parse HEAD)
if [ "$RELEASE_TAG_COMMIT" != "$HEAD_COMMIT" ]; then
  echo "ERROR: release tag v$VERSION commit $RELEASE_TAG_COMMIT != head commit $HEAD_COMMIT" >&2
  exit 3
fi
# now close & release
COORDS="--settings=$MAVEN_SETTINGS -DserverId=$REPOSITORY_ID -DnexusUrl=$REPOSITORY_URL"
STAGING_REPO_BASENAME=$(echo -n $GROUP_ID | sed -E 's/\.//g')
set -x
OPEN_STAGINGS=$(mvn nexus-staging:rc-list $COORDS | egrep "^\\[INFO\\]\\s{1,}$STAGING_REPO_BASENAME\\-[0-9]{4,}\\s{1,}OPEN.*$" | awk '{print $2}' | sort -r -b)
STAGING=$(echo -n "$OPEN_STAGINGS" | head -n 1)
set +x
if [ -z "$STAGING" ]; then
  echo "ERROR: no staging repositories found" >&2
  exit 5
elif [ $(echo -n "$OPEN_STAGINGS" | wc -l) -gt 1 ]; then
  echo "ERROR: multiple staging repositories found:\n$OPEN_STAGINGS" >&2
  exit 6
fi
COORDS="$COORDS -DstagingRepositoryId=$STAGING"
set -x
mvn nexus-staging:rc-close $COORDS
mvn nexus-staging:rc-release $COORDS
set +x
export INSTANT=$(date --utc +%Y%m%d%H%M%S)
echo "Maven Central sync requested at $INSTANT; see http://repo1.maven.org/maven2/$(echo $GROUP_ID | sed -E 's,\.,/,g')/$ARTIFACT_ID/$VERSION/"

$(dirname $0)/npm-publish.sh
