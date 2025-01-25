package com.wipro.java.operators;

public class Question2 {

	public static void main(String[] args) {
		byte b1 = 12;
		byte b2 = 10;
		//byte b3 = 22;
		//byte b3 = b1 + b2; //Type mismatch: cannot convert from int to byte
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
	}

}
