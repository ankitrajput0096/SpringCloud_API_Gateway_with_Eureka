package com.springservice.clientone.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springservice.clientone.utils.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
@RequestMapping(value="/clientOne/ControllerTwo")
public class simpleControllerTwo {

    private static Logger logger =
            LoggerFactory.getLogger(simpleControllerTwo.class);

    @Autowired
    private Environment env;

    @RequestMapping(
            value="/EndpointOne",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointOne(
            @RequestHeader("sso-token") String token) {

        logger.info("Inside service client one, controller two and endpoint one");
        logger.info("Now processing sso token passed by api gateway"+token);
        //Add a small delay in response
        utils.addDelay(3);

        return ResponseEntity
        .ok()
        .body("This is hello endpoint one from controller two in " +
                "client One on port : " +
                (env.getProperty("local.server.port")));
    }

    @RequestMapping(
            value="/EndpointTwo",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointTwo(
            @RequestHeader("sso-token") String token) {

        logger.info("Inside service client one, controller two and endpoint two");
        logger.info("Now processing sso token passed by api gateway"+token);
        //Add a small delay in response
        utils.addDelay(3);

        return ResponseEntity
        .ok()
        .body("This is hello endpoint two from controller two " +
                "in client One on port : " +
                (env.getProperty("local.server.port")));
    }
}