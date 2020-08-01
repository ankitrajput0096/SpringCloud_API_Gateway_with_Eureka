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
                        .filters(f -> f.addRequestHeader("sso-token", "I-am-ssotoken")              //Pre filter
                                .addResponseHeader("leaving-header", "I-am-header-for-response"))   //Post filter
                        .uri("lb://CLIENTONE")       // here, lb => is for load balanced
                        .id("clientOne"))

                .route(r -> r.path("/clientTwo/**")
                        .filters(f -> f.addRequestHeader("sso-token", "I-am-ssotoken")              //Pre filter
                                .addResponseHeader("leaving-header", "I-am-header-for-response"))   //Post filter
                        .uri("lb://CLIENTTWO")       // here, lb => is for load balanced
                        .id("clientTwo"))
                .build();
        //NOTE: Can create custom Pre, Post and Global filters if major changes are required at API gateway level.
    }

}