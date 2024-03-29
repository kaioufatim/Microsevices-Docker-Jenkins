FROM amazoncorretto:17
VOLUME /tmp
COPY target/Friend-service-0.0.1-SNAPSHOT.jar  friend.jar
ENTRYPOINT ["java", "-jar","friend.jar"]