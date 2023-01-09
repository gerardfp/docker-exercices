FROM gradle:jdk11
COPY      app /app
WORKDIR   /app
RUN       gradle build
CMD       ["java", "-jar", "/app/build/libs/app.jar"]