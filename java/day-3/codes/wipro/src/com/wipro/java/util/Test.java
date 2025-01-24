package com.wipro.java.util;

public class Test {

	public static void main(String[] args) {
		System.out.println("Adv Java".compareTo("Core Java"));
		
		String str = "Raja Hyderabad raja@hotmail.com 798748547";
		String[] items = str.split(" ");
		
		System.out.println("no of words = " + items.length);
		
		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[2]);
		System.out.println(items[3]);
		
		System.out.println("=".repeat(100));
		
		for(String word : items) {
			System.out.println("----> " + word);
		}
	}

}
