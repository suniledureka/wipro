package com.wipro.java.oops;

import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("which banks' card? [1.SBI | 2.ICICI] : ");
		int cardType = sc.nextInt();
		
		Bank bank = null;
		
		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("###--- Card Read Error --- Try Again ---###");
				return;
		}

		System.out.println("\n"+"=".repeat(10)+ bank.getClass().getSimpleName()+"=".repeat(10)+"\n");
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		
		System.out.print("enter option: ");
		int opt = sc.nextInt();

		if(opt == 1){
			System.out.print("how much amount to deposit? ");
			float amt = sc.nextInt();
			bank.deposit(amt);
		}
		else
			bank.withdraw(500);

		System.out.println(Bank.code);
		System.out.println(SBI.code);
		System.out.println(ICICI.code);
		System.out.println(bank.code);

		//bank.code = 7896; //error: cannot assign a value to final variable code
		System.out.println("-".repeat(100));
		
		bank.gstProcess();
		
		Bank.aTestMethod();
		
		sc.close();
	}
}
