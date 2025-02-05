package com.wipro.boot.rest.controllers;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.rest.dto.Passenger;
import com.wipro.boot.rest.entities.Ticket;
import com.wipro.boot.rest.exceptions.TicketNotFoundException;
import com.wipro.boot.rest.repository.TicketRepository;
import com.wipro.boot.rest.utils.PNRGenerator;

@RestController
@RequestMapping("/irctc")
public class TicketRestController {
	private TicketRepository ticketRepo;
	private PNRGenerator pnrGen;

	public TicketRestController(TicketRepository ticketRepo, PNRGenerator pnrGen) {
		super();
		this.ticketRepo = ticketRepo;
		this.pnrGen = pnrGen;
	}

	@PostMapping(value = "/ticket", consumes = { "application/xml", "application/json" }, produces = {
			"application/xml", "application/json" })
	public ResponseEntity<?> newTicketBooking(@RequestBody Passenger passenger) {
		// --logic to generate the ticket for passenger and to save in DB

		Ticket ticket = new Ticket();

		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTrainNo(passenger.getTrainNo());

		ticket.setTicketFare((new Random().nextInt(1000, 2000)));

		LocalDate date = LocalDate.now();
		ticket.setDateOfBooking(date);

		ticket.setBookingStatus(new Random().nextBoolean() ? "CONFIRMED" : "WAITING");
		ticket.setPnr(pnrGen.generatePNR());

		Ticket savedTicket = ticketRepo.save(ticket);

		return new ResponseEntity<Ticket>(savedTicket, HttpStatus.CREATED);
	}

	@GetMapping(path = "/ticket/{pnr}", 
			    produces = { "application/xml", "application/json" })
	public ResponseEntity<?> findTicketByPnr(@PathVariable String pnr) {
		Ticket ticket = null;
		
		Optional<Ticket> optTicket = ticketRepo.findById(pnr);
		
		if (optTicket.isPresent()) {
			ticket = optTicket.get();
			return ResponseEntity.ok(ticket);
		} else {
			//return new ResponseEntity<String>("no booking done on PNR: " + pnr, HttpStatus.OK);
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping(path = "/ticket/{pnr}")
	public ResponseEntity<?> cancelTicketById(@PathVariable String pnr){
		if(ticketRepo.existsById(pnr)) {
			Ticket ticketToDelete = ticketRepo.findById(pnr).get();
			
			ticketRepo.deleteById(pnr);
			return new ResponseEntity<String>(String.format("Ticket with PNR: %-6s got Cancellend and the refund of Rs. %d will hit your a/c in 06 working days", pnr, ticketToDelete.getTicketFare()), HttpStatus.OK);
		}else {
		   //throw new RuntimeException("Ticket with PNR: "+ pnr + " Not Found");	
		   throw new TicketNotFoundException("Ticket with PNR: "+ pnr + " Not Found");	
		}		
	}	
	
	//only for understanding -- you write the actual logic
	@PutMapping(path = "/ticket/{pnr}")
	public ResponseEntity<?> modifyTicketByid(@PathVariable String pnr){
		Optional<Ticket> optTkt = ticketRepo.findById(pnr);
		if(optTkt.isPresent()) {
			Ticket tkt = optTkt.get();
			tkt.setBookingStatus("CNF");
			ticketRepo.save(tkt);
		}
		return new ResponseEntity<String>("Modification Success", HttpStatus.OK);
	}	
}
