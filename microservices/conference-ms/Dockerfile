FROM openjdk:11

WORKDIR /app

COPY target/test-*-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]

EXPOSE 8081
