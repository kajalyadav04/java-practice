package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age =scanner.nextInt();
		String name=scanner.next();
		String addreString=scanner.next();
		int mobile=scanner.nextInt();
		String urlString = "jdbc:mysql://localhost:3306/jdbcdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urlString, "root", "root");
			Statement s = connection.createStatement();
			String staString ="insert into student values("+age+",'"+name+"','"+addreString+"',"+mobile+")";
			System.out.println(staString);
			int rows= s.executeUpdate(staString);
			if(rows>0) {
				System.out.println("rows affected succesfully");
			}
			else {
				System.out.println("rows remain unaffected");
			}
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
