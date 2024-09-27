package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class CreateStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("enter age");
			int age = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("address");
			String addreString = scanner.next();
			System.out.println("mobile");
			int mobile = scanner.nextInt();
			System.out.println("marks");
			int marks = scanner.nextInt();
			String urlString = "jdbc:mysql://localhost:3306/jdbcdb";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(urlString, "root", "root");
				Statement s = connection.createStatement();
				String staString = "insert into student values(" + age + ",'" + name + "','" + addreString + "',"
						+ mobile + "," + marks + ")";

				System.out.println(staString);
				int rows = s.executeUpdate(staString);
				if (rows > 0) {
					System.out.println("rows affected succesfully");
				} else {
					System.out.println("rows remain unaffected");
				}

//				toAddColumn(s);
				graceMarks(s);

				connection.close();

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("if you want to exit the program press 0 otherwise any num");
			System.out.println("enter value ");
			n = scanner.nextInt();

		} while (n != 0);
	}

	public static void graceMarks(Statement statement) throws SQLException {
		String queryString = "update student set marks=marks+500 where marks<=500";
		int rows = statement.executeUpdate(queryString);

		System.out.println(rows);
	}

	public static void toAddColumn(Statement statement) throws SQLException {
		String queryString = "alter table student add marks int";
		int rows = statement.executeUpdate(queryString);

		System.out.println(rows);

	}
}
