 
# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring_boot_cloud_api_gateway
WORKDIR /spring_boot_cloud_api_gateway/SpringBootCloudAPIGateway

# building the spring boot app
RUN mvn clean install

WORKDIR /spring_boot_cloud_api_gateway/SpringBootCloudAPIGateway/target

# running the spring boot app
CMD ["java", "-jar", "springbootcloudgateway-0.0.1-SNAPSHOT.jar"]
