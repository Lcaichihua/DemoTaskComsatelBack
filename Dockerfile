FROM openjdk:11
ADD target/DemoTaskComsatel.jar DemoTaskComsatel.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "DemoTaskComsatel.jar"]