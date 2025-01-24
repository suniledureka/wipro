package com.wipro.java.arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,85,76,99,65,80};
		
		System.out.println("no of subjects = " + marks.length);		
		
		System.out.println();
		
		//array iteration using for loop
		for(int i=0; i<marks.length; i++) {
			System.out.printf("mark for subject-%d = %d \n", (i+1), marks[i]);
		}
		
		System.out.println();
		
		//array iteration using enhanced-for loop
		for(int mark : marks) {
			System.out.println(mark);			
		}
		System.out.println();
		
		System.out.println(marks[5]); //80
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}