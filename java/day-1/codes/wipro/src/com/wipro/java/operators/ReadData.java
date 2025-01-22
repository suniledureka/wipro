package com.wipro.java.operators;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your name: ");
		//String name = sc.next(); //reads one work
		String name = sc.nextLine();
		
		System.out.println("Hello " + name);
		
		sc.close();
	}

}
