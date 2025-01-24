package com.wipro.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Book> library = new ArrayList<Book>();
		String req = "Y";
		
		do {
			System.out.print("enter book id: ");
			long bid = sc.nextLong();
			sc.nextLine();
			
			boolean bidExists = checkBookIdExists(library, bid);
			
			if(bidExists) {
				System.err.println("Book with ID: " + bid + " already in Stock");
			}else {
				System.out.println("enter book title & author: ");
				String title = sc.nextLine();
				String author = sc.nextLine();
			
				Book book = new Book(bid, title, author);
				library.add(book);
			}
			System.out.print("do you want to add more books? [Y/N]: ");
			req = sc.nextLine();
		}while(req.equalsIgnoreCase("Y"));
		
		printBooksInLibrary(library);
	}

	private static boolean checkBookIdExists(List<Book> library, long bid) {
		for(Book bk : library) {
			long id = bk.getBookId();
			if(id == bid) {
				return true;
			}
		}//for
		return false;
	}

	private static void printBooksInLibrary(List<Book> library) {
		System.out.println("\n ====== WIPRO || KNOWLEDGE CENTER ======");
		for(Book bk : library) {
			System.out.println(bk);
		}
	}
}
