package com.jdbc;

import java.sql.*;

public class JavaConnectivity {

	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/jdbcdb";
//		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(urlString,"root","root")) {
			
//			connection = DriverManager.getConnection(urlString,"root","root");
			System.out.println(connection);
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
