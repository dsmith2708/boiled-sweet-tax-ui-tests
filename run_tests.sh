#!/usr/bin/env bash

BROWSER=${1:-chrome}

echo "Running browser tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Env:                  local"
echo "Journey:              Boiled Sweet Tax Registration UI Tests"
echo "=========================================="
sbt clean -Dbrowser="${BROWSER}" -Denvironment=local -Dbrowser.option.headless=true"testOnly specs.*" testReport
