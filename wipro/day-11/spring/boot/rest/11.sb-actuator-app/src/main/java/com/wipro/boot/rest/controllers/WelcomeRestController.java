package com.wipro.boot.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WelcomeRestController {
	
	@GetMapping(path = "/welcome")
	public String showWelcomeMessage() {
		return "Welcome to Wipro Technologies";
	}
}
