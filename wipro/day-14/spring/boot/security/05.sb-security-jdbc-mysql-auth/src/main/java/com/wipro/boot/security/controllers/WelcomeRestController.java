package com.wipro.boot.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Welcome to Wipro Technologies";
	}
}
