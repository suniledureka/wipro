package com.wipro.boot.utils;

import java.util.Base64;

public class PasswordUtility {

	public PasswordUtility() {
		System.out.println("PasswordUtility :: Constructor");
	}

	public String stringEncoder(String str) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(str.getBytes());
		return encodedString;
	}
}
