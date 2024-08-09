package com.wipro.library.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.library.dao.BooksDAO;
import com.wipro.library.models.Book;

@Service
public class LibraryServices {
	private static List<Book> books = BooksDAO.getAllBooks();
	
	public List<Book> allBooks(){
		return books;
	}
	
	public Book findBookById(Integer bid) {
		for(Book bk : books) {
			if(bk.getBookId().equals(bid))
				return bk;
		}
		
		return null;
	}
	
	public boolean saveNewBook(Book book) {	
		
		for(Book bk : books) {
			if(bk.getBookId().equals(book.getBookId()))
				return false;
		}
		
		books.add(book);
		return true;
	}
	
	
	public boolean deleteBookById(Integer bid) {
		for(Book bk : books) {
			if(bk.getBookId().equals(bid)) {
				books.remove(books.remove(bk));
				return true;
			}
		}
		
		return false;		
	}
	
	public boolean updateBookById(Integer bid, Book book) {
		for(Book bk : books) {
			if(bk.getBookId().equals(bid)) {
				bk.setBookTitle(book.getBookTitle());
				bk.setBookPrice(book.getBookPrice());
				return true;
			}
		}
		
		return false;			
	}
}
