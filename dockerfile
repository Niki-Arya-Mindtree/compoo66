FROM maven:latest
COPY . .
COPY /target/checkcking6pro-1.jar app.jar
CMD java -jar app.jar