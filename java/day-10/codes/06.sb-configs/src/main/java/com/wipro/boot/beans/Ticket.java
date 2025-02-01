package com.wipro.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Value("${ticket.pnr}")
	private String pnr;
	
	@Value("Praveen Kumar")
	private String passengerName;

	@Override
	public String toString() {
		return "Ticket [PNR= " + pnr + " | NAME= " + passengerName + "]";
	}
}
