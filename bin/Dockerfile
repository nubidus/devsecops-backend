FROM adoptopenjdk:11

WORKDIR /app

COPY ./target/kurs-0.0.1-SNAPSHOT.jar  myapp-backend.jar

ENTRYPOINT ["java","-jar","myapp-backend.jar"]