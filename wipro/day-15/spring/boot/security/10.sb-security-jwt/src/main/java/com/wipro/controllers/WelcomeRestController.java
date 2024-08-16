package com.wipro.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

    @GetMapping("/welcome")
    public String test() {
        this.logger.warn("method is called...");
        return "Welcome to Wipro Technologies.. !!!";
    }
}
