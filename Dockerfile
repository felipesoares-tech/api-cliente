#FROM ubuntu:latest AS build
#
#RUN apt-get update
#RUN apt-get install openjdk-17-jdk -y
#COPY . .
#
#RUN apt-get install maven -y
#RUN mvn clean install
#
#FROM openjdk:17-jdk-slim
#
#EXPOSE 8080
#
#COPY --from=build /target/*.jar app.jar
#
#ENTRYPOINT [ "java", "-jar", "app.jar" ]

FROM openjdk:17-jre

WORKDIR /app

COPY target/*.jar /app/api.jar

EXPOSE 8080

CMD ["java", "-jar", "api.jar"]
