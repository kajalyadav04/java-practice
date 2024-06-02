package com.lnct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
		Statement st = con.createStatement();
		int row = st.executeUpdate("insert into student values(23,'Rakesh','Patna','568834')");
				
				if(row>0) {
					System.out.println("Student detail has inserted..");
					}else {
					System.out.println("Student detail has not inserted..");
					}
					con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
