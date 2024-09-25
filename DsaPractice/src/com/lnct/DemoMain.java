package com.lnct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1.load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.get connection object using Driver class
			String url= "jdbc:mysql://localhost:3306/jdbcdb";
			String username ="root";
			String password ="root";
			  
			
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection successful");
//			 close the connection
			connection.close();
			System.out.println("closed");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("connection failed");
		}
	}

}
