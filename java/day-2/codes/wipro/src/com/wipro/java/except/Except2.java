package com.wipro.java.except;

public class Except2 {

	public static void main(String[] args) {
		System.out.println("main method starts");
		
		String str = "625";
		System.out.println(str + 25); //62525
		
		int n = Integer.parseInt(str);
		System.out.println(n + 25); // 650
		
		str = "A";
		n = Integer.parseInt(str); //java.lang.NumberFormatException
		
		System.out.println("main method ends");
	}

}
