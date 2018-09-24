#!/bin/sh

set -eu

BASEDIR=$(pwd)

cd source
./gradlew build --no-daemon

cp build/libs/* $BASEDIR/output


