package com.wipro.boot.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsRestController {
	
	@GetMapping(path = {"/greet", "/greetings"})
	public String showWelcomeMessage() {
		return "Greetings from Wipro Technologies";
	}
}
