package com.wipro.java.oops.bank;

public class CurrentAccount extends Account {
	int transactionsCount = 0;

	public CurrentAccount(long acno, String name, float bal) {
		super(acno, name, bal);
	}

	@Override
	void deposit(float amt) {
		transactionsCount++;
		super.deposit(amt);
	}

	@Override
	void withdraw(float amt) {
		transactionsCount++;
		super.withdraw(amt);
	}

	@Override
	void getBalance() {
		transactionsCount++;
		super.getBalance();
	}
	
	public void serviceCharge() {
		if(transactionsCount > 3) {
			int additionalTrans = transactionsCount - 3;
			float serviceCharge = additionalTrans * 100;
			System.out.println(String.format("Additonal Transaction of %d is done & Service Charge is %.2f", additionalTrans, serviceCharge));
			super.withdraw(serviceCharge);
		}
	}
}
