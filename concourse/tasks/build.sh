#!/bin/sh

set -eu

chmod 777 -R source
cd source
gradle build --no-daemon

