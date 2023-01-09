FROM eclipse-temurin:11 as builder
WORKDIR   /app
COPY      . .
RUN       javac -d ./build src/Main.java
WORKDIR   /app/build
RUN       jar cfe hellodocker.jar Main Main.class


FROM eclipse-temurin:11
WORKDIR   /app
COPY      --from=builder /app/build/hellodocker.jar .
CMD       java -jar hellodocker.jar
