package com.wipro.testing.services;

public class CheckEven {
	
	public boolean isEven(int num) {
		int rem = num % 2;
		
		if(rem == 0) {
			return true;
		}else {
			return false;
		}
	}
}
