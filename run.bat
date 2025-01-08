@echo off

echo Starting Vaadin frontend...
start /B gradle -p Frontend bootRun

echo Starting Spring Boot backend...
start /B gradle -p Backend bootRun

echo Both Vaadin frontend and Spring Boot backend servers are running.
pause
