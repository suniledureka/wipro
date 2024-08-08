package com.wipro.boot.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String showWelcomeMessageGet() {
		return "Welcome to Wipro from GET";
	}
	
	@PostMapping("/welcome")
	public String showWelcomeMessagePost() {
		return "Welcome to Wipro from POST";
	}
	
	@PutMapping("/welcome")
	public String showWelcomeMessagePut() {
		return "Welcome to Wipro from PUT";
	}
	
	@DeleteMapping("/welcome")
	public String showWelcomeMessageDelete() {
		return "Welcome to Wipro from DELETE";
	}
	
	@PatchMapping("/welcome")
	public String showWelcomeMessagePatch() {
		return "Welcome to Wipro from PATCH";
	}
}
