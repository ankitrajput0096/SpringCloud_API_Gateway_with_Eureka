package com.cloudgateway.springbootcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
// This annoation is used to make this spring service as eureka client.
@SpringBootApplication
public class SpringbootcloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcloudgatewayApplication.class, args);
	}

}
