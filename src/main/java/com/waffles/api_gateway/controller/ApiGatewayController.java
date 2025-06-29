package com.waffles.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
