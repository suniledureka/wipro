package com.wipro.library.dao;

import java.util.ArrayList;
import java.util.List;

import com.wipro.library.models.Book;

public class BooksDAO {
	static List<Book> books = new ArrayList<Book>();
	
	public static List<Book> getAllBooks(){		
		Book book1 = new Book(1001, "Java Reference", 575.50f);
		Book book2 = new Book(1002, "Python Reference", 750f);
		Book book3 = new Book(1003, "Microservices Reference", 875.50f);
		Book book4 = new Book(1004, "Spring with Spring Boot Reference", 1275.50f);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		return books;		
	}
}
