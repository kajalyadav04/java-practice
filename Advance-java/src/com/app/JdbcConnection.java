package com.app;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import sun.jvm.hotspot.oops.java_lang_Class;

import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String urlString="jdbc:mysql://localhost:3306/jdbcdb";
		String rootString="root";
		String paswordString="root";
		
		try {
			Connection con= DriverManager.getConnection(urlString, rootString, paswordString);
			
			Statement statement=con.createStatement();
			int row= statement.executeUpdate("insert into student values(23,'Rakesh','Patna',5688349232,87)");
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
