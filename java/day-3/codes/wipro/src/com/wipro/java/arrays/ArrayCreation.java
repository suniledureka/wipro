package com.wipro.java.arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 89;
		marks[1] = 92;
		System.out.println(marks.length);
		
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + "\t");
		}
		System.out.println();
		
		float[] salaries = new float[5];
		for(float sal : salaries) {
			System.out.print(sal + "\t");
		}
		System.out.println();
		
		String[] names = new String[7];
		for(String name : names) {
			System.out.print(name + "\t");
		}
		
		System.out.println();
		
		float sal = 4875.55687f;
		System.out.println(sal);
		
		System.out.printf("%f \n", sal);
		System.out.printf("%.0f \n", sal);
		System.out.printf("%.2f \n", sal);
	}

}
