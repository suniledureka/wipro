package com.wipro.boot.rest.entities;

import java.time.LocalDate;

import com.wipro.boot.rest.dto.adapter.LocalDateAdapter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {
	@Id
	private String pnr;
	
	private String passengerName;
	private String fromStation;
	private String toStation;
	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfJourney;
	private String trainNo;

	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfBooking;
	private String bookingStatus;
	private Integer ticketFare;
}
