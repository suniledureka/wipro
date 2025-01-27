package com.wipro.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	public static Connection getDBConnection() throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("com/wipro/java/jdbc/dbconfig");
		
		String url = bundle.getString("jdbc.url");
		String uname = bundle.getString("jdbc.username");
		String pass = bundle.getString("jdbc.password");
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		return con;
	}
}
