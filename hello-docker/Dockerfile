FROM eclipse-temurin:11
COPY      . /app
WORKDIR   /app
RUN       javac -d ./build src/Main.java
WORKDIR   ./build
RUN       jar cfe hellodocker.jar Main Main.class
CMD       java -jar hellodocker.jar
