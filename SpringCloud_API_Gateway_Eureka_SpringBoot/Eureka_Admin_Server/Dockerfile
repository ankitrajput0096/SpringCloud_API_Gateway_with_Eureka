 
# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring_boot_eureka_admin_server
WORKDIR /spring_boot_eureka_admin_server/EurekaAdminServer

# building the spring boot app
RUN mvn clean install

WORKDIR /spring_boot_eureka_admin_server/EurekaAdminServer/target
