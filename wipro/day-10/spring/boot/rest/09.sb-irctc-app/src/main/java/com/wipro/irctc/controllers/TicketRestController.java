package com.wipro.irctc.controllers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.irctc.models.Passenger;
import com.wipro.irctc.models.Ticket;
import com.wipro.irctc.utils.PNRGenerator;

@RestController
@RequestMapping("/irctc")
public class TicketRestController {
	@Autowired
	private PNRGenerator pnrGen;
	
	@PostMapping(path = "/ticket/book",
			     consumes = {"application/json", "application/xml"},
			     produces = {"application/json", "application/xml"}
				)
	public ResponseEntity<Ticket> doNewTicketBooking(@RequestBody Passenger passenger){
		System.out.println(passenger);
		
		Ticket ticket = new Ticket();
		
		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTrainNo(passenger.getTrainNo());
		
		String pnr = pnrGen.generatePNR();
		ticket.setPnr(pnr);
		
		ticket.setDateOfBooking(LocalDate.now());
		
		float ticketFare = new Random().nextFloat(1000, 2000);
		ticket.setTicketFare((float)Math.round(ticketFare));
		
		//String status = new Random().nextBoolean()? "CNF" : "WAT";
		List<String> ticketStatusData = Arrays.asList("CNF","RLWL","WL","RAC");
		String status = ticketStatusData.get(new Random().nextInt(ticketStatusData.size()));
		ticket.setBookingStatus(status);
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
}
