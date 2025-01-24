package com.wipro.java.except;

import java.sql.SQLException;

public class UserServices {
	
	public String getUserNameById(int id) throws SQLException{
		//logic to get the user name from data store 
		if(id == 101)
			return "Sanjay";
		return "Guest";
	}
}
