#!/bin/sh

# Gradle wrapper script - absolute path version
GRADLE_VERSION="8.5"
INSTALL_DIR="/opt/gradle"
GRADLE_HOME="$INSTALL_DIR/gradle-${GRADLE_VERSION}"

if [ ! -d "$GRADLE_HOME" ]; then
    echo "Downloading Gradle ${GRADLE_VERSION}..."
    mkdir -p "$INSTALL_DIR"
    cd "$INSTALL_DIR" || { echo "Failed to cd to $INSTALL_DIR"; exit 1; }
    
    curl -sL "https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip" -o "gradle.zip" || { echo "Download failed"; exit 1; }
    unzip -q gradle.zip || { echo "Unzip failed"; exit 1; }
    rm gradle.zip
fi

exec "$GRADLE_HOME/bin/gradle" "$@"
