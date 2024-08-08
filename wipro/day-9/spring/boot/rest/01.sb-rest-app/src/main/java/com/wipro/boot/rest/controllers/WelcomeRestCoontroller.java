package com.wipro.boot.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@ResponseBody
public class WelcomeRestCoontroller {
	
	//@RequestMapping("/welcome")
	//@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	@GetMapping("/welcome")
	public String showWelocmeMessage() {
		String message = "Welcome to Wipro Technologies";
		return message;
	}
}
