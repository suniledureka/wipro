package com.wipro.java.arrays;

public class FormattedOutput {

	public static void main(String[] args) {
		int[] slnos = {1, 2, 3};
		String[] particulars = {"Pizza", "Puff", "Cool Drinks"};
		float[] unitPrices = {10, 20, 10};
		int[] quantities = {10,12,5};
		
		for(int i=0; i<slnos.length; i++) {
			String data = String.format("%2d  %-15s %.2f %2d %.2f", slnos[i], particulars[i], unitPrices[i], quantities[i], (unitPrices[i] * quantities[i]));
			System.out.println(data);	
		}

	}

}
