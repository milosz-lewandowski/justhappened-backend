#different jdk on localhost (oracle jdk)

FROM openjdk:8-jdk-alpine
ADD target/miloszlewandowski-01.jar .
EXPOSE 80
CMD java -jar miloszlewandowski-01.jar