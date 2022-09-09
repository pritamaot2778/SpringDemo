FROM openjdk:8
EXPOSE 8085
ADD target/docker-demo.jar docker-demo.jar

ENTRYPOINT ["java","-jar","docker-demo.jar"]