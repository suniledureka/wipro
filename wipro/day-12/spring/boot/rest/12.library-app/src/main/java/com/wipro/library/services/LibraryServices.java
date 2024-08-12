package com.wipro.library.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.library.entity.Book;
import com.wipro.library.repository.LibraryRepository;

@Service
public class LibraryServices {
	@Autowired
	private LibraryRepository libRepo;
	
	public Iterable<Book> allBooks(){
		return libRepo.findAll();
	}
	
	public Book findBookById(Integer bid) {
		Book book = null;
			Optional<Book> optBook = libRepo.findById(bid);
			if(optBook.isPresent())
				book = optBook.get();
			
			return book;
	}
	
	public boolean saveNewBook(Book book) {	
		boolean isExists = libRepo.existsById(book.getBookId());
		if(!isExists) {
			libRepo.save(book);
			return true;
		}
		return false;
	}
	
	
	public boolean deleteBookById(Integer bid) {
		boolean isExists = libRepo.existsById(bid);
		if(isExists) {
			libRepo.deleteById(bid);
			return true;
		}
		
		return false;		
	}
	
	public boolean updateBookById(Integer bid, Book book) {
		if(libRepo.existsById(bid)) {
			libRepo.save(book);
			return true;
		}		
		return false;			
	}
}
