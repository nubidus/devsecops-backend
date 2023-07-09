FROM adoptopenjdk:11

WORKDIR /app

COPY ./target/kurs-1.0-SNAPSHOT.jar  myapp-backend.jar

ENTRYPOINT ["java","-jar","myapp-backend.jar"]

