package com.wipro.java.operators;

public class IncrementOperator {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n++); //post increment - 10
		System.out.println(++n); //pre increment - 12
		
		n = 10;
		n = n++ + ++n;
		System.out.println(n);
	}

}
