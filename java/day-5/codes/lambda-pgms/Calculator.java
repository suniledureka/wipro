package com.capgemini.java.lambdas;

public class Calculator {
	public static void main(String[] args) {
		// --- through anonymous class
		Nums numsRef = new Nums() {
			@Override
			public int add(int x, int y) {
				int s = x+y;
				return s;
			}			
		};
		
		System.out.println("sum = " + numsRef.add(10, 12));
		
		// --- through lambdas
		Nums numsRef1 = (int x, int y) -> {
			int s = x+y;
			return s;
		};
		System.out.println("sum = " + numsRef1.add(11, 12));
		
		
		// --- through lambdas
		Nums numsRef2 = (x, y) -> {
			int s = x+y;
			return s;
		};
		
		System.out.println("sum = " + numsRef2.add(12, 12));	
		
		// --- through lambdas
		Nums numsRef3 = (x,  y) -> {return x+y;	};		
		System.out.println("sum = " + numsRef3.add(13, 12));
		
		// --- through lambdas
		//Nums numsRef4 = (x,  y) -> (x+y);		
		Nums numsRef4 = (x,  y) -> x+y;
		System.out.println("sum = " + numsRef4.add(14, 12));		
	}

}
