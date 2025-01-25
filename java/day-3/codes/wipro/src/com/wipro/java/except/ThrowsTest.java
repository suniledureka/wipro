package com.wipro.java.except;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserServices userServiceObj = new UserServices();

		// int uid = 100;
		int uid = 101;

		try {
			String userName = userServiceObj.getUserNameById(uid);
			System.out.println("Welcome " + userName);
		} catch (Exception ex) { 
			ex.printStackTrace();		
		}
		
		System.out.println("Please wait for 5 seconds......");
		Thread.sleep(5000); //5000ms
		System.out.println("Thanks for waiting!!");
	}

}
