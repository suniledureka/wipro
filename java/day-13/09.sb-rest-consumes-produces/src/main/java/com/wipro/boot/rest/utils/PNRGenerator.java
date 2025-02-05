package com.wipro.boot.rest.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class PNRGenerator {
	
	public String generatePNR() {
		UUID uuid = UUID.randomUUID();
		String randomText = uuid.toString();
		randomText = randomText.replace("-", "");
		String pnr = randomText.substring(0, 6).toUpperCase();
		return pnr;
	}
}
