package com.wipro.java.operators;
public class Largest {

	public static void main(String[] args) {
		int a = 206;
		int b = 200;
		int c = 35;
		
		int lar = findLargest(a,b,c);
		System.out.println(String.format("largest of(%d, %d, %d) = %d", a, b, c, lar));
	}

	private static int findLargest(int a, int b, int c) {
		int lar = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		return lar;
	}

}
