#!/bin/sh

set -eu

chmod 777 -R source
cd source
./gradlew build --no-daemon

ls -R

