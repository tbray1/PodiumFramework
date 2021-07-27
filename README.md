<h1 align="center"> Podium Coding Challenge </h1> <br>



## Introduction

Selenium Framework for podium coding challenge that includes 6 test cases

## Technologies


* Java
* Maven
* Selenium Webdriver / Selenium Grid
* Docker
* TestNG



## Requirements
The application can be run locally or in a docker container, the requirements for each setup are listed below.




### Local Requirements
* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/download.cgi)


### Docker
* [Docker](https://www.docker.com/get-docker)



### Run Tests Locally
```bash
$ mvn clean test
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

