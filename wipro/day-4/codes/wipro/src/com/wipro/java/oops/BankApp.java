package com.wipro.java.oops;

import java.util.Scanner;

public class BankApp {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Account acc = null;
		float amt;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.print("\nenter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				if(acc == null) {
					System.out.print("enter a/c no: ");
					long acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("enter name: ");
					String name = sc.nextLine();
					
					System.out.print("enter initial deposit: ");
					amt = sc.nextFloat();
					
					acc = new Account(acno, name, amt);
					System.out.println("Welcome to State Bank of India");
				}else {
					System.out.println("A/C is already with Us!!!!");
				}
				break;
			case 2:
				if(acc != null) {
					System.out.print("enter an amount to deposit: ");
					amt = sc.nextFloat();
					acc.deposit(amt);
				}else {
					System.err.println("###--- Please open an A/C with us!! ---###");
				}
				break;
			case 3:
				if(acc != null) {
					System.out.print("enter an amount to withdraw: ");
					amt = sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.err.println("###--- Please open an A/C with us!! ---###");
				}				
				break;
			case 4:
				if(acc != null) {
					acc.getBalance();
				}else {
					System.err.println("###--- Please open an A/C with us!! ---###");
				}				
				break;
			case 5:
				System.out.println("Application Designed & Developed by ");
				System.out.println("\t team@wipro");
				System.exit(0);
				break;
			default:
				System.err.println("@@@--- INVALID OPERATION --- TRY AGAIN ---@@@");
				break;				
			}
			System.out.println();
		} //while
	}

}
