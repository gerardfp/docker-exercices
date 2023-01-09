FROM gradle:jdk11 AS build
WORKDIR /app
COPY ./server .
RUN gradle build --no-daemon

FROM eclipse-temurin:11
WORKDIR /app
COPY --from=build /app/build/libs/*.jar my-server.jar
CMD ["java", "-jar","my-server.jar"]