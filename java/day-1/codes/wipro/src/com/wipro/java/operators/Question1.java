package com.wipro.java.operators;
public class Question1 {

	  void compute(int a, int b)
	  {
	    System.out.println(a/b);
	  }

	  void compute(float a, float b)
	  {
	 	System.out.println(a * b);
	  }

	  void compute(int a, float b)
	  {
	    System.out.println(a / b);
	  }

	 public static void main(String[] args)
	 {
	   Question1 a = new Question1();

	   a.compute(1,2);
	   a.compute(2,2.0f);
	   a.compute((float)4,2.0f);
	 }
}
