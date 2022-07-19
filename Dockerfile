FROM openjdk:8
LABEL maintainer="sameer.shrestha"
ADD target/tweetapp-0.0.1-SNAPSHOT.jar docker-tweetapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","tweetapp-0.0.1-SNAPSHOT.jar"]