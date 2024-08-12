package com.wipro.library.exceptions;

public class BookNotFoundException extends RuntimeException{

	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(String message) {
		super(message);
	}

}
