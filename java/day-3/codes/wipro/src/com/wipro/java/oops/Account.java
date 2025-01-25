package com.wipro.java.oops;

public class Account {
	long acno;
	String name;
	float bal;
	
	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	public void deposit(float amt) {
		this.bal = this.bal + amt;
		System.out.println("Rs."+amt + " Credited | Balance: " + this.bal);
	}
	
	public void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal = this.bal - amt;
			System.out.println("Rs."+amt + " Debited | Balance: "+ this.bal);
		}else {
			System.err.println("ERROR: Insufficient Balance!!");
		}
	}
	
	public void getBalance() {
		System.out.printf("A/C No: %-16d | NAME: %-20s | BALANCE: %.2f \n", this.acno, this.name, this.bal);
	}
}
