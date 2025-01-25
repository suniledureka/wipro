package com.wipro.java.operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 25;
		int lar = 0;
		
		/*
		if(x > y) {
			lar = x;
		}else {
			lar = y;
		}
		*/
		
		lar = (x > y) ? x : y;
		
		System.out.println("largest of (" + x + ", " + y + ") = " + lar);
	}

}
