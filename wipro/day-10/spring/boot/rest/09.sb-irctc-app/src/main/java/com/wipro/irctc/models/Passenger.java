package com.wipro.irctc.models;

import java.time.LocalDate;

import com.wipro.irctc.models.adapters.LocalDateAdapter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Passenger {
	private String passengerName;
	private String fromStation;
	private String toStation;	
	
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate dateOfJourney;
	private String trainNo;
}
