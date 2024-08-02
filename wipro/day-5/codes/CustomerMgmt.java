package com.wipro.java.oops;

public class CustomerMgmt {

	public static void main(String[] args) {
		Customer cust = new Customer(1001, "Praveen");
		
		Integer cid = cust.customerId();
		String cname = cust.customerName();
		
		System.out.println(cid + " - " + cname);
		
		var cust1 = new Customer(1002, "Sanjay");
		System.out.println(cust1);
	}

}
