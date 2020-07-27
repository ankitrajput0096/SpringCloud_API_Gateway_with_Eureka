package com.cloudgateway.springbootcloudgateway.apiGatewayConfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    // This is where we maintain routing logic of api gateway.
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/clientOne/**")
                        .uri("lb://CLIENTONE")       // here, lb => is for load balanced
                        .id("clientOne"))

                .route(r -> r.path("/clientTwo/**")
                        .uri("lb://CLIENTTWO")       // here, lb => is for load balanced
                        .id("clientTwo"))
                .build();
    }

}