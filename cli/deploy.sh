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
REPOSITORY_URL=${REPOSITORY_URL:-$DEFAULT_REPOSITORY_URL}
echo "REPOSITORY_URL=$REPOSITORY_URL"
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
  PASS="$(mvn help:evaluate -f "$CLI_DIR" --settings="$MAVEN_SETTINGS" -Dexpression=gpg.passphrase | egrep -v '^\[.*' | xargs)" # get "downloading" messages out of the way
  PASS="$(mvn help:evaluate -f "$CLI_DIR" --settings="$MAVEN_SETTINGS" -Dexpression=gpg.passphrase | egrep -v '^\[.*' | xargs)" # now egrep will work
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

# if this is a SNAPSHOT build, then we're done
if [ -n "$SNAPSHOT" ]; then
  exit 0
fi
# else this is a release & is now staged

# if release tag commit is not HEAD commit, bork
RELEASE_TAG_COMMIT=$(git show-ref -s --tags v$VERSION)
HEAD_COMMIT=$(git rev-parse HEAD)
if [ "$RELEASE_TAG_COMMIT" != "$HEAD_COMMIT" ]; then
  echo "ERROR: release tag v$VERSION commit $RELEASE_TAG_COMMIT != head commit $HEAD_COMMIT; skipping staging" >&2
  exit 3
fi
# if we're not on a maintenance branch, bork
CURRENT_BRANCH=$(git rev-parse --abbrev-ref HEAD)
if [[ "$CURRENT_BRANCH" =~ ^v[0-9]+\.[0-9]+\.x$ ]]; then
  echo "ERROR: current branch $CURRENT_BRANCH is not a maintenance branch; skiping staging" >&2
  exit 4
fi

# now close & release
COORDS="-DserverId=$REPOSITORY_ID -DnexusUrl=$REPOSITORY_URL"
STAGINGS=$(mvn nexus-staging:rc-list --settings="$MAVEN_SETTINGS" $COORDS | egrep '^\[INFO\]\s{1,}ioyaktor\-[0-9]{4,}\s{1,}OPEN.*$' | awk '{print $2}' | sort -r -b)
STAGING=$(cat "$STAGINGS" | head -n 1)
if [ -z "$STAGING" ]; then
  echo "ERROR: No staging repositories found!" >&2
  exit 5
elif [ $(cat "$STAGINGS" | wc -l) -gt 1 ]; then
  echo "WARNING: multiple staging repositories found; only using the latest: $STAGING" >&2
fi
mvn nexus-staging:rc-close --settings="$MAVEN_SETTINGS" $COORDS \
  -DstagingRepositoryId=$STAGING \
  -DautoReleaseAfterClose=true \
  -DautoDropAfterRelease=true
