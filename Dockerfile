FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} topik-e-learning.jar

ENTRYPOINT ["java", "-jar", "backend-service.jar"]

EXPOSE 8080