package com.wipro.boot.rest.controllers;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.rest.dto.Passenger;
import com.wipro.boot.rest.dto.Ticket;
import com.wipro.boot.rest.utils.PNRGenerator;

@RestController
@RequestMapping("/irctc")
public class TicketRestController {
	@Autowired
	private PNRGenerator pnrGen;
	
	@PostMapping(value = "/ticket")
	public ResponseEntity<?> newTicketBooking(@RequestBody Passenger passenger){
		//--logic to generate the ticket for passenger and to save in DB

		Ticket ticket = new Ticket();
		
		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTrainNo(passenger.getTrainNo());
				
		ticket.setTicketFare((new Random().nextInt(1000,2000)));
		
		LocalDate date = LocalDate.now();
		ticket.setDateOfBooking(date);
		
		ticket.setBookingStatus(new Random().nextBoolean() ? "CONFIRMED" : "WAITING");
		ticket.setPnr(pnrGen.generatePNR());
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
}
