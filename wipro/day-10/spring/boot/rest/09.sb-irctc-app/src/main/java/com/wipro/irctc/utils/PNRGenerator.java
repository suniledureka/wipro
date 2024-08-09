package com.wipro.irctc.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class PNRGenerator {

	public String generatePNR() {
		UUID uuid = UUID.randomUUID();
		String pnr = uuid.toString().replaceAll("-", "").substring(0, 7).toUpperCase();
		return pnr;
	}
}
