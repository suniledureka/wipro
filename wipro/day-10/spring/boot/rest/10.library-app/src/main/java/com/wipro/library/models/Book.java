package com.wipro.library.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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

@Schema(name = "Book", description = "Schema to hold Book information")
public class Book {
	@JsonProperty("isbn")
	@XmlElement(name = "isbn")
	@Schema(description = "ISBN of Book", example = "1005" )
	private Integer bookId;
	
	@JsonProperty("title")
	@XmlElement(name = "title")
	@Schema(description = "Title of Book", example = "Java Complete Reference" )
	private String bookTitle;
	
	@JsonProperty("price")
	//@XmlElement(name = "isbn")
	@Schema(description = "Price of Book", example = "925.75" )
	private Float bookPrice;
}
