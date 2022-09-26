FROM openjdk:17
ADD target/DemoTaskComsatel.jar DemoTaskComsatel.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "DemoTaskComsatel.jar"]
