package com.wipro.library.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.library.entity.Book;
import com.wipro.library.exceptions.BookNotFoundException;
import com.wipro.library.services.LibraryServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/library")
@Tag(name = "Books Controller", description = "Peform CRUD operations in Library")
public class LibraryRestController {
	private LibraryServices libService;
		
	//constructor injection
	public LibraryRestController(LibraryServices libService) {
		super();
		this.libService = libService;
	}

	@GetMapping(path = "/books")
	public Iterable<Book> showAllBooks(){
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

	@Operation(summary = "Adding a New Book to Library",
	           description = "Add a New Book to Stock of Library")
			   @ApiResponses(
					   	      @ApiResponse(responseCode = "201",
	                                       description = "BOOK ADDED"))	
	@PostMapping(path = "/book/save", 
				consumes = {"application/json", "application/xml"})
	public ResponseEntity<String> addNewBook(@Valid @RequestBody Book newBook){
		System.out.println(newBook);
		
		boolean isAdded = libService.saveNewBook(newBook);
		
		if(isAdded)
			return new ResponseEntity<String>("Book Added to Library", HttpStatus.OK);
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Book with the same ISBN exists");
	}
	
	@DeleteMapping(path = "/book/remove")
	public ResponseEntity<String> deleteBookFromStock(@RequestParam("isbn") Integer isbn){
		boolean deleteStatus = libService.deleteBookById(isbn);
		if(deleteStatus)
			return ResponseEntity.ok("Book Deleted from Stock");
		else {
			//return ResponseEntity.badRequest().body("no book matching with isbn");
			throw new BookNotFoundException("no book with isbn: " + isbn);
		}
	}
	
	@PutMapping(path = "/book/modify/{isbn}")
	public ResponseEntity<String> modifyBookInStock(@PathVariable("isbn") Integer isbn, @RequestBody Book updateBook){
		boolean updateStatus = libService.updateBookById(isbn, updateBook);
		if(updateStatus)
			return ResponseEntity.ok("Book updated in Stock");
		else
			return ResponseEntity.badRequest().body("no book matching with isbn");
	}	
}
