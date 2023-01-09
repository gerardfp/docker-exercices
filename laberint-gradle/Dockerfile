FROM gradle:jdk11
WORKDIR   /app
COPY      app .
RUN       gradle build
CMD       ["java", "-jar", "/app/build/libs/app.jar"]