package com.wipro.java.oops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		String name;
		
		System.out.print("enter id: ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter name: ");
		name = sc.nextLine();
		
		System.out.println();
		
		System.out.println(id + " --- " + name);
		sc.close();
	}

}
