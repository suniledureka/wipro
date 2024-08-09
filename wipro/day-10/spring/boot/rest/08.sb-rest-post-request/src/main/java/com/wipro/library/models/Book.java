package com.wipro.library.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	@JsonProperty("isbn")
	@XmlElement(name = "isbn")
	private Integer bookId;
	
	@JsonProperty("title")
	@XmlElement(name = "title")
	private String bookTitle;
	
	@JsonProperty("price")
	//@XmlElement(name = "isbn")
	private Float bookPrice;
}
