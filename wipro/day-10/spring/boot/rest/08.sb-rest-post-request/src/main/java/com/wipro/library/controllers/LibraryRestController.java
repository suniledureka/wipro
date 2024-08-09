package com.wipro.library.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.library.models.Book;
import com.wipro.library.services.LibraryServices;

@Controller
@ResponseBody
@RequestMapping("/library")
public class LibraryRestController {
	private LibraryServices libService;
		
	//constructor injection
	public LibraryRestController(LibraryServices libService) {
		super();
		this.libService = libService;
	}

	@GetMapping(path = "/books")
	public List<Book> showAllBooks(){
		return libService.allBooks();
	}
	
	@GetMapping(path = "/book/{isbn}", 
				produces = {"application/json", "application/xml"})
	public ResponseEntity<Book> searchBookByIsbn(@PathVariable("isbn") Integer isbn){
		Book book = libService.findBookById(isbn);
		if(book != null)
			return ResponseEntity.ok(book);
		else
			return ResponseEntity.notFound().build();
	}
	
	@PostMapping(path = "/book/save", 
				consumes = {"application/json", "application/xml"})
	public ResponseEntity<String> addNewBook(@RequestBody Book newBook){
		System.out.println(newBook);
		
		boolean isAdded = libService.saveNewBook(newBook);
		
		if(isAdded)
			return new ResponseEntity<String>("Book Added to Library", HttpStatus.OK);
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Book with the same ISBN exists");
	}
}
