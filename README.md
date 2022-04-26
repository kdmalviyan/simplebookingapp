# Getting Started

## How to run application
It is a simple spring boot application can build and run with gradle.
  
1. Run following commands to start application
    gradle build
    java -jar <project_home>/build/libs/simplepaymentapp-0.0.1-SNAPSHOT.jar --server.port=<server port> (Default port is 8080)
    Access application on http://localhost:8080 or specified port
2. Import the code into any IDE of your choice
   Find class SimplePaymentApplication.java in package com.secretescapes.simplepaymentapp
   Run as java application
   Access application on http://localhost:8080 (If you want to change the port update server.port property in /src/main/resources/application.properties)

## UI templates are _available_ inside /src/main/resources/templates
  
### IMPORTANT: For email testing, I could not find any free mail server. I created a test gmail user for email testing in this app and using the same user for sending mails. 
