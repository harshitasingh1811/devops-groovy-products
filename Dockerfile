FROM anapsix/alpine-java
LABEL maintainer="harshitasingh102@gmail.com"
COPY /target/devops-groovy-products1-0.0.1-SNAPSHOT.jar /home/devops-groovy-products1-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","devops-groovy-products1-0.0.1-SNAPSHOT.jar"]