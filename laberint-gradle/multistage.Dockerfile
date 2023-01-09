FROM gradle:jdk11 as builder
WORKDIR   /app
COPY      app .
RUN       gradle build

FROM eclipse-temurin:11
WORKDIR /app
COPY --from=builder /app/build/libs/app.jar .
CMD       ["java", "-jar", "app.jar"]