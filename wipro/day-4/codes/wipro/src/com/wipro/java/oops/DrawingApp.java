
package com.wipro.java.oops;

import java.util.Scanner;
public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape sh = null;
		//sh = new Shape(); //Cannot instantiate the type Shape
		
		System.out.print("which shape do you want to work with? [1. Rect | 2. Circle | 3. Triangle] : ");
		int shapeType = sc.nextInt();
		System.out.println();
		
		switch(shapeType) {
		 case 1:
			System.out.print("enter color of rectangle: ");
			String color = sc.next();
			System.out.print("enter length of rectangle: ");
			int length = sc.nextInt();
			System.out.print("enter breadth of rectangle: ");
			int breadth = sc.nextInt();
			
			sh = new Rectangle(color, length, breadth);
			break;
		 case 2:
			System.out.print("enter color of circle: ");
			color = sc.next();
			System.out.print("enter radius of circle: ");
			float radius = sc.nextFloat();	
			sh = new Circle(color, radius);
			break;
		 case 3:
			System.out.print("enter color of triangle: ");
			color = sc.next();
			System.out.print("enter base of triangle: ");
			int base = sc.nextInt();
			System.out.print("enter height of triangle: ");
			int height = sc.nextInt();	
			sh = new Triangle(color, base, height);
			break;
		 default:
			 System.err.println("INVALID SHAPE SELECTION -- TRY AGAIN");
			 return;
		}//swicth
		
		
		System.out.println("\n"+"=".repeat(15)+" SHAPE SELECTED : "+ sh.getClass().getSimpleName().toUpperCase()+" "+"=".repeat(15));
		
		System.out.println("color of \"" + sh.getClass().getSimpleName()+"\" = " + sh.getColor());
		System.out.print("do you want to change the color of "+ sh.getClass().getSimpleName() + " [Y/N]: ");
		String colorChange = sc.next();
		
		if(colorChange.equalsIgnoreCase("Y")) {
			System.out.print("enter new color for "+ sh.getClass().getSimpleName()+": " );
			String color = sc.next();
			sh.setColor(color);
			System.out.println("new color of \"" + sh.getClass().getSimpleName()+"\" = " + sh.getColor());
		}
		sh.area();
	}//main

}//class
