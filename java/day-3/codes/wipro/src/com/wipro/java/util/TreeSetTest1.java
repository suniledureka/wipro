package com.wipro.java.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		Set<Book> library = new TreeSet<Book>();
		
		Book bk1 = new Book(10001L, "Java", "James");
		Book bk2 = new Book(10985L, "Python", "Ramesh");
		Book bk3 = new Book(10874L, "React", "Valerie");
		Book bk4 = new Book(10358L, "Angular", "Sachin");
		
		library.add(bk1);
		library.add(bk2);
		library.add(bk3);
		library.add(bk4);
		
		for(Book bk : library) {
			System.out.println(bk);
		}

	}

}
