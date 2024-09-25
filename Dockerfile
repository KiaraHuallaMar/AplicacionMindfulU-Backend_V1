FROM amazoncorretto:17-alpine-jdk
MAINTAINER ALDAIR
COPY target/Mindful-U-0.0.1-SNAPSHOT.jar MyndfulServiceBackend.jar
ENTRYPOINT ["java","-jar","/MyndfulServiceBackend.jar"]