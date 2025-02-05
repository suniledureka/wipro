package com.wipro.boot.rest.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Ticket {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private LocalDate dateOfJourney;
	private String trainNo;
	
	private String pnr;
	private LocalDate dateOfBooking;
	private String bookingStatus;
	private Integer ticketFare;
}
