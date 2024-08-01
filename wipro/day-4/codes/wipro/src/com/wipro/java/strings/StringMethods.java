package com.wipro.java.strings;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		//stringMethods1();
		//stringMethods2();
		//stringMethods3();
		//stringMethods4();
		stringMethods5();
	}

	private static void stringMethods1() {
		String str = "Wipro Technologies Limited";
		
		System.out.println("length = " + str.length());
		System.out.println("charAt(0) = " + str.charAt(0));
		System.out.println("charAt(25) = " + str.charAt(25));
		//System.out.println("charAt(26) = " + str.charAt(26)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(e) from index 0 = " + str.indexOf("e")); //7
		System.out.println("indexOf(e) from index 8 = " + str.indexOf("e", 8)); //16
		System.out.println("lastIndexOf(e) = " + str.lastIndexOf("e")); //24
		System.out.println("indexOf(Tech) = " + str.indexOf("Tech")); //6
		System.out.println("indexOf(java) = " + str.indexOf("java")); //-1
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		System.out.println(str.replace('e', '*'));
		System.out.println(str.replace("e", "?"));
	}


	private static void stringMethods2() {
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2); //false
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.contentEquals(str2)); //true
		
		str1 = new String("ABC");
		str2 = new String("abc");
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.contentEquals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		String s1 = "ABC";
		String s2 = "ABC";
		int n = s1.compareTo(s2);
		//returns 0 - if both the objects are equal, otherwise it returns the numerical difference between 
		//the first non-matching character
		System.out.println(n); //0
		
		s1 = "ABC";
		s2 = "ADA";
		n = s1.compareTo(s2);
		System.out.println(n); //66-68 = -2
	}	
	
	private static void stringMethods3() {
		String str = "Java is a high level programming language used for developing platform independent apps";
		String[] words = str.split(" ");
		System.out.println("no of words = " + words.length);
		for(String word : words) {
			System.out.print("---> " + word +"\t");
		}
		System.out.println();
		System.out.println("-".repeat(100));
		
		str = "word1, word2 word3@word4!word5.word6";
		words = str.split("[, @!.]+");
		System.out.println("no of words = " + words.length);
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	private static void stringMethods4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your name: ");
		String name = sc.nextLine();
		
		boolean isValid = name.matches("^[A-Z a-z]+$");
		System.out.println(String.format("\"%s\" is valid? %b", name, isValid));
		sc.close();		
	}	
	

	private static void stringMethods5() {
		String s1 = "Wipro";
		String s2 = new String("Wipro");
		System.out.println(s1 == s2); // false
		
		String s3 = s2.intern();
		System.out.println(s1 == s3); //true
		System.out.println(s2 == s3); //false
		
	}	
}
