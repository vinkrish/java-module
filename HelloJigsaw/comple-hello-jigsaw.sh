#!/usr/bin/env bash
javac -d modules --module-source-path  $(find simple-modules -name "*.java")
