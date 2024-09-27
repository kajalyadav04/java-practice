package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("roll no to be deleted24");
		int roll = scanner.nextInt();

		String urlString = "jdbc:mysql://localhost:3306/jdbcdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urlString, "root", "root");
			PreparedStatement s = connection.prepareStatement("delete from student where roll=? ");

			s.setInt(1, roll);

//						Statement s = connection.createStatement();
//						String staString = "insert into student values(" + age + ",'" + name + "','" + addreString + "',"
//								+ mobile + "," + marks + ")";
			//
//						System.out.println(staString);
			int rows = s.executeUpdate();
			if (rows > 0) {
				System.out.println("rows deleted succesfully");
			} else {
				System.out.println("rows remain unaffected");
			}

//						toAddColumn(s);
//						graceMarks(s);

			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
