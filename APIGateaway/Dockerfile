FROM openjdk:17
EXPOSE 8075
ADD target/APIGateaway-0.0.1-SNAPSHOT.jar APIGateaway.jar
ENTRYPOINT ["java", "-jar", "APIGateaway.jar"]