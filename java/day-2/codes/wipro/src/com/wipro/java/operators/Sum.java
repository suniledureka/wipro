package com.wipro.java.operators;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		int sum = x + y;
		
		System.out.println("sum = " + sum);
		System.out.println(x + " + " + y + " = " + sum);
		
		System.out.printf("%d + %d = %d \n", x, y, sum);
		
		sc.close();
	}

}
