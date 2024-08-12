package com.wipro.boot.aop.services;

import org.springframework.stereotype.Service;

@Service
public class PasswordValidator {
	public boolean validatePassword(String pass) {
		System.out.println("\u001B[31mlogic to validate password!!!!\033[0m");
		
		int passLength = pass.trim().length();
		if(passLength >= 6)
			return true;
		
		throw new RuntimeException("password should be min 6 character length");
	}
}
