package com.wipro.java.oops.bank;

public class SavingsAccount extends Account {
	float roi;

	public SavingsAccount(long acno, String name, float bal, float roi) {
		super(acno, name, bal);
		this.roi = roi;
	}
	
	public void calculateInterest() {
		float intrstAmount = this.bal * roi / 100;
		System.out.println("Rs" + intrstAmount + " is the Interest");
		super.deposit(intrstAmount);
	}
}
