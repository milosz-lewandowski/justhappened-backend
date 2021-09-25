FROM openjdk:16-alpine

ADD target/miloszlewandowski-0.2.4.jar .

EXPOSE 80

CMD java -jar miloszlewandowski-0.2.4.jar