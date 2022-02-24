FROM openjdk
COPY target/test-1.0-SNAPSHOT.jar jenkins-test.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","jenkins-test.jar"]