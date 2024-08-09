package com.wipro.library.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.library.dao.BooksDAO;
import com.wipro.library.models.Book;

@Service
public class LibraryServices {

	public List<Book> allBooks(){
		return BooksDAO.getAllBooks();
	}
	
	public Book findBookById(Integer bid) {
		List<Book> books = BooksDAO.getAllBooks();
		for(Book bk : books) {
			if(bk.getBookId().equals(bid))
				return bk;
		}
		
		return null;
	}
}
