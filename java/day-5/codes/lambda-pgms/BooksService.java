package com.capgemini.java.lambdas;

import java.util.Collections;
import java.util.List;

public class BooksService {
	public List<Book> getBooksInOrderOfBookId(){
		BooksDAO booksDao = new BooksDAO();
		List<Book> booksList = booksDao.getAllBooks();
		
		/*
		booksList.sort((b1, b2) -> {
			if(b1.getBookId() > b2.getBookId())
				return 1;
			else
				return -1;
		});
		*/
		
		booksList.sort((b1, b2) -> (b1.getBookId()>b2.getBookId()) ? 1 : -1);
		return booksList;
	}
}
