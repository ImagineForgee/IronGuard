#!/bin/bash

echo "Starting Vaadin frontend..."
cd Frontend && ./gradlew bootRun &

echo "Starting Spring Boot backend..."
cd Backend && ./gradlew bootRun &

wait
echo "Both Vaadin frontend and Spring Boot backend servers are running."
