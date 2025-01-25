package com.wipro.java.operators;
public class BitwiseOperatorVsLogical {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		//boolean res = (a > b) && (a > c++);
		boolean res = (a > b) & (a > c++);
		System.out.println(res);
		System.out.println(c);
		
		System.out.println(10 & 15); //10
		System.out.println(10 | 15); //15
		System.out.println(10 ^ 15); //5
	}

}
