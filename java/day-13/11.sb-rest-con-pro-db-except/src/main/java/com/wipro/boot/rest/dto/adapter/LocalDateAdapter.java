package com.wipro.boot.rest.dto.adapter;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) throws Exception {		
		return LocalDate.parse(v);
	}

	@Override
	public String marshal(LocalDate v) throws Exception {		
		 return v.toString();
	}
}
