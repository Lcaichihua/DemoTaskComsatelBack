FROM openjdk:8
ADD target/DemoTaskComsatel-0.0.1-SNAPSHOT.jar DemoTaskComsatel.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "DemoTaskComsatel.jar"]
