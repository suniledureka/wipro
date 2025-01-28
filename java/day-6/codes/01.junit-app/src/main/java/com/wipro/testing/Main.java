package com.wipro.testing;

import com.wipro.testing.services.Largest;

public class Main {

	public static void main(String[] args) {
		Largest larObj = new Largest();
		
		int[] data = {58,46,25,90,12,47};
		int expected = 90;
		int actual = larObj.findLargest(data);
		if(expected == actual) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}

		
		int[] data1 = {-58,46,25,-90,12,-47};
		expected = 46;
		actual = larObj.findLargest(data1);
		if(expected == actual) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}
		
		int[] data2 = {-58,-46,-25,-90,-12,-47};
		expected = -12;
		actual = larObj.findLargest(data2);
		if(expected == actual) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}		
	}

}
