package com.wipro.boot.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to State Bank of India";
	}
	
	@GetMapping("/balance")
	public String balancePage() {
		return "This page shows Customer's Account Balance";
	}	
	
	@GetMapping("/statement")
	public String statementsPage() {
		return "This page shows Customer's Monthly Statement";
	}	
	
	@GetMapping("/loans")
	public String loansPage() {
		return "This page shows Customer's Loan A/cs Details";
	}	
	
	@GetMapping("/contact")
	public String contactPage() {
		return "Contact SBI's Customer Care using No: xxxxxxxxxxx";
	}
}
