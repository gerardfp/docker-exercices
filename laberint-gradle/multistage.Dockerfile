FROM gradle:jdk11 as builder
COPY      app /app
WORKDIR   /app
RUN       gradle build

FROM eclipse-temurin:11
WORKDIR /app
COPY --from=builder /app/build/libs/app.jar .
CMD       ["java", "-jar", "app.jar"]