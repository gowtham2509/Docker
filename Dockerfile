FROM openjdk:8
EXPOSE 8080
ADD target/gowtham-image.jar gowtham-image.jar
ENTRYPOINT ["java","-jar","/gowtham-image.jar"]