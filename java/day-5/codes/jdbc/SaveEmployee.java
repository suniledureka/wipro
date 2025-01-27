package com.wipro.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101, 'Ajay', 2500.75)";
		String sql = "insert into emp(empno, ename, sal) values(102, 'Praveen', 3500), (103, 'Sanjay',4500),"
				+ "(104, 'Rahul', 5500), (105, 'Valerie', 2575.5)";
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("employees saved = " + employeesSaved);
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		st.close();
		con.close();
	}

}
