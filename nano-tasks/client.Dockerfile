FROM gradle:jdk19 AS build
WORKDIR /app
COPY client .
RUN gradle build --no-daemon

FROM eclipse-temurin:19
WORKDIR /app
COPY --from=build /app/build/libs/*.jar my-client.jar
CMD ["java", "-jar","my-client.jar"]