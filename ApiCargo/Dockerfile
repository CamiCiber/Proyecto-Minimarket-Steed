FROM openjdk:17-alpine
EXPOSE 8088
ARG JAR_FILE=target/ApiCargo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
