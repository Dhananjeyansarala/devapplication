FROM eclipse-temurin:17
COPY target/devapplication.jar devapplication.jar
CMD [ "java","-jar","devapplication.jar" ]