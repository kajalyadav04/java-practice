
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("gmarks");
		int gmarks = scanner.nextInt();
		int n;

		String urlString = "jdbc:mysql://localhost:3306/jdbcdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urlString, "root", "root");
			PreparedStatement s = connection.prepareStatement("update student set marks=marks+? where marks<9500");

			s.setInt(1, gmarks);

//						Statement s = connection.createStatement();
//						String staString = "insert into student values(" + age + ",'" + name + "','" + addreString + "',"
//								+ mobile + "," + marks + ")";
			//
//						System.out.println(staString);
			int rows = s.executeUpdate();
			if (rows > 0) {
				System.out.println("rows affected succesfully");
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
