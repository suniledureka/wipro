package com.wipro.boot.rest.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Passenger {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private LocalDate dateOfJourney;
	private String trainNo;
}
