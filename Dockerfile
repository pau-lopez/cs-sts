FROM openjdk:11-jre-slim
VOLUME /tmp
EXPOSE 8080
ADD flightreservation-0.0.1-SNAPSHOT.jar flightreservation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","flightreservation-0.0.1-SNAPSHOT.jar"]