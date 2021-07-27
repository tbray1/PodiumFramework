<h1 align="center"> Podium Coding Challenge </h1> <br>



## Introduction

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/e91606af4a364076a7058c5ea1c006a8)](https://www.codacy.com/app/joneubank/microservice-template-java?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=overture-stack/microservice-template-java&amp;utm_campaign=Badge_Grade)
[![CircleCI](https://circleci.com/gh/overture-stack/microservice-template-java/tree/master.svg?style=shield)](https://circleci.com/gh/overture-stack/microservice-template-java/tree/master)

Selenium Framework for podium coding challenge that includes 6 test cases

## Technologies


* Java
* Maven
* Selenium Webdriver / Selenium Grid
* Docker
* TestNG



## Requirements
The application can be run locally or in a docker container, the requirements for each setup are listed below.




### Local
* [Java 8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/download.cgi)


### Docker
* [Docker](https://www.docker.com/get-docker)



### Run Tests Locally
```bash
$ mvn spring-boot:run
```

Application will run by default on port `1234`

Configure the port by changing `server.port` in __application.yml__


### Run Tests using Docker

First build the image:
```bash
$ docker-compose build
```

When ready, run it:
```bash
$ docker-compose up
```

