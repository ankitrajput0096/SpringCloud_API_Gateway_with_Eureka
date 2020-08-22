package com.cloudgateway.springbootcloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SpringCloudFallBackContoller {

    @RequestMapping("/clientOnefallback")
    public Mono<String> clientOneFallBack() {
        return Mono.just("Client One API is taking too " +
                "long to respond or is down. Please try again later");
    }
    @RequestMapping("/clientTwofallback")
    public Mono<String> clientTwoFallBack() {
        return Mono.just("Client Two API is taking too " +
                "long to respond or is down. Please try again later");
    }
}