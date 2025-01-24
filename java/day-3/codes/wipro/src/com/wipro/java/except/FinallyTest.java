package com.wipro.java.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter a number: ");
			int x = sc.nextInt();
			
			System.out.print("enter a number: ");
			int y = sc.nextInt();
			
			int z = x / y;
			System.out.printf("%d / %d = %d \n", x, y, z);
			return;
		}catch(ArithmeticException ex) {
			System.err.println("catch block");
			System.err.println(ex);
			//return;
			System.exit(0); //finally block will not gets executed
		}
		finally {
			System.out.println("--- finally block ---");
			System.out.println("application designed & developed by");
			System.out.println("B1 Java React Team");
			sc.close();
		}
		
	}
}
