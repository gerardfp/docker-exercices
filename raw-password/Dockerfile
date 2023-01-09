FROM gradle:jdk19 AS build
WORKDIR /app
COPY ./app .
RUN gradle build --no-daemon

FROM eclipse-temurin:19
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
CMD ["java", "-jar","app.jar"]