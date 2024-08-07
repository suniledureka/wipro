package com.wipro.boot.utils;

import java.util.Base64;

public class PasswordEncoder {

	public PasswordEncoder() {
		System.out.println("PasswordEncoder :: Constructor");
	}
	
	public String encodeData(String data) {
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] byteData = data.getBytes();
		
		String encodedData = encoder.encodeToString(byteData);
		return encodedData;
	}
	
	public void initMethod() {
		System.out.println("userdefined initialization of PasswordEncoder");
	}
	
	public void destroyMethod() {
		System.out.println("userdefined destructor of PasswordEncoder");
	}	
}
