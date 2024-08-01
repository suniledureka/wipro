package com.wipro.java.oops;

import java.util.Scanner;

public class CMSApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many students to be enrolled? ");
		int noOfStudents = sc.nextInt();
		
		Student[] students = new Student[noOfStudents];
		
		for(int i=0; i<noOfStudents; i++) {
			System.out.print("enter stdent name: ");
			String name = sc.next();
			
			Student st = new Student(name);
			students[i] = st;
		}
		System.out.println("=".repeat(100));
		System.out.println("\t\t WIPRO ACADEMY");
		System.out.println("-".repeat(100));
		
		printStudents(students);
		
		sc.close();
	}

	private static void printStudents(Student[] students) {
		for(Student st : students)
			System.out.println(st);
	}

}
