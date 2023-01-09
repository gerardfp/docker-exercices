FROM eclipse-temurin:11
WORKDIR   /app
COPY      . .
RUN       javac -d ./build src/Main.java
WORKDIR   ./build
RUN       jar cfe hellodocker.jar Main Main.class
CMD       java -jar hellodocker.jar
