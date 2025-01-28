package com.wipro.testing.services;

public class Largest {
	
	public int findLargest(int[] nums) {
		//int lar = 0;
		int lar = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > lar) {
				lar = nums[i];
			}			
		}
		return lar;
	}
}
