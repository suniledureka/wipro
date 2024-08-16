package com.wipro.boot.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to State Bank of India";
	}
	@GetMapping("/admin")
	public String adminPage() {
		return "This page is for Administrators - Page-2";
	}
	
	@GetMapping("/admin/page1")
	public String adminPage1() {
		return "This page is for Administrators - Page-1";
	}

	@GetMapping("/admin/page2")
	public String adminPage2() {
		return "This page is for Administrators - Page-2";
	}
	
	@GetMapping("/manager")
	public String managerPage() {
		return "This page is for Managers";
	}

	@GetMapping("/clerk")
	public String clerkPage() {
		return "This page is for Clerks";
	}
	
	@GetMapping("/contact")
	public String customerCarePage() {
		return "Contact SBI's Customer Care using No: xxxxxxxxxxx";
	}
}
