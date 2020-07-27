 
# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring_boot_clientOne
WORKDIR /spring_boot_clientOne/clientone

# building the spring boot app
RUN mvn clean install

WORKDIR /spring_boot_clientOne/clientone/target

# running the spring boot app
CMD ["java", "-jar", "clientone-0.0.1-SNAPSHOT.jar"]
