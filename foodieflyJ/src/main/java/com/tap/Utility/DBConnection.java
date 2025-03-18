package com.tap.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static final Connection getConnection() {
		Connection connection = null;
		String URL = "jdbc:mysql://localhost:3306/foodiefly";
		String USERNAME = "root";
		String PASSWORD = "Jasse@159";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
