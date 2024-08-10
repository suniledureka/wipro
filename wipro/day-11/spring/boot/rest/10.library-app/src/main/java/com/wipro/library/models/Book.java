package com.wipro.library.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	@NotNull(message = "bookId is required")
	private Integer bookId;
	
	@JsonProperty("title")
	@XmlElement(name = "title")
	@Schema(description = "Title of Book", example = "Java Complete Reference" )
	@NotEmpty(message = "title should be more than 0 length")
	//@NotBlank(message = "title should not be empty with spaces")
	@Size(min = 5, max=30, message="title should be min 5 to 30 chars")
	private String bookTitle;
	
	@JsonProperty("price")
	//@XmlElement(name = "isbn")
	@Schema(description = "Price of Book", example = "925.75" )
	@NotNull(message = "book price is required")
	@Min(value = 1000, message = "price should be min Rs.1000")
	private Float bookPrice;
}
