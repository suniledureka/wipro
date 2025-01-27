package com.wipro.java.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//initialize MySQL JDBC Driver
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connect to Database - db_wipro
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_wipro", "root", "root");
		
		//create a provision for passing SQL Queries to connected DB
		Statement st = con.createStatement();
		
		//pass the SQL Query to create table
		String sql = "create table emp(empno int(5) primary key, ename varchar(30), sal float(10,2))";
		
		try {
			st.execute(sql);
			System.out.println("DB Table Created!!!");
		}catch(Exception ex) {
			System.err.println("ERROR: " + ex.getMessage());
		}
		
		//close connection with DB
		st.close();
		con.close();
	}
}
