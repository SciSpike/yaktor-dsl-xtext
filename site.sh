#!/bin/bash

usage()
{
cat << EOF
usage: $0 options

This script uploads the update site to a given subSite.

OPTIONS:
   -h                 Show this message
   -k [path]          to ssh -i pk
   -r <range>         semver range
EOF
}
RANGE=
KEY=~/.ssh/inferwik_dsa

while getopts "hk:r:" OPTION
do
  case $OPTION in
    k)
      KEY=$OPTARG
      ;;
    r)
      RANGE=$OPTARG
      ;;
    ?)
      usage
      exit 1
      ;;
  esac
done

if [[ -z $RANGE ]]
then
  echo missing range $RANGE
  usage
  exit 1
fi

SITES=$(ssh -i ${KEY} -p 18765 scispike@184.154.224.18 "ls ~/public_html/conversation/update.all/")
npm install
echo semver -r "${RANGE}" ${SITES}
MATCHING_SITES=$(semver -r "${RANGE}" ${SITES})
mkdir -p site
./site.js -s "$MATCHING_SITES"
rsync -av --rsh="ssh -i ${KEY} -p 18765" site/* scispike@184.154.224.18:"public_html/conversation/update.all/"
