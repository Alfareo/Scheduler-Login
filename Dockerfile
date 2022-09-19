FROM openjdk:11.0.7-jre-slim
VOLUME /tmp
EXPOSE 8111
ARG JAR_FILE=target/spring-boot-security-jwt-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} scheduler-security.jar
ENTRYPOINT ["java","-jar","scheduler-security.jar"]
