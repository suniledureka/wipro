package com.capgemini.java.lambdas;

import java.util.ArrayList;
import java.util.List;

public class BooksDAO {
	public List<Book> getAllBooks(){
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(365, "Java Reference", 525.50f));
		books.add(new Book(225, "Python Reference", 350f));
		books.add(new Book(926, "React Reference", 725.75f));
		books.add(new Book(123, "Angular Reference", 220.5f));
		books.add(new Book(224, "Spring Reference", 745f));
		books.add(new Book(462, "Microservice Reference", 950f));
		
		return books;
	}
}
