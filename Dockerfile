FROM openjdk:15-alpine

RUN apk --no-cache add curl jq

WORKDIR /user/podium


ADD target/Podium.jar          Podium.jar
ADD target/Podium-tests.jar    Podium-tests.jar
ADD target/libs                libs


ADD testng.xml                  testng.xml
ADD check.sh                    check.sh

ENTRYPOINT sh check.sh