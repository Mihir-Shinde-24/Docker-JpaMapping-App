FROM openjdk:8
EXPOSE 8080
WORKDIR /usr/src/bootapp
COPY ./target/JpaMappingApp-0.0.1-SNAPSHOT.jar /usr/src/bootapp
CMD [ "java", "-jar", "JpaMappingApp-0.0.1-SNAPSHOT.jar" ]
