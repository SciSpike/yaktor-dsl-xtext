#!/usr/bin/env bash -xe
npm install
cur_version=$(mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version -N | egrep -v "(^\[INFO\]|^\[DEBUG\])" | xargs $(npm bin)/semver -i patch)
next_version=$(echo $cur_version | xargs $(npm bin)/semver -i $1)
echo "$cur_version -> $next_version"

find . -name site.xml | xargs -n 1 sed -i.bak "s/$cur_version/$next_version/g" 
find . -name MANIFEST.MF | xargs -n 1 sed -i.bak "s/Bundle-Version: ${cur_version}.qualifier/Bundle-Version: ${next_version}.qualifier/g"
find . -name feature.xml | xargs -n 1 sed -i.bak "s/version=\"${cur_version}.qualifier/version=\"${next_version}.qualifier/g"
find . -name *.bak | xargs rm
mvn org.codehaus.mojo:versions-maven-plugin:2.1:set -DgenerateBackupPoms=false -DnewVersion=${next_version}-SNAPSHOT -DoldVersion=${cur_version}-SNAPSHOT -N
