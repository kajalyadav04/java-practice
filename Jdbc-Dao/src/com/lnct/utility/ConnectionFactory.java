package com.lnct.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String driverclassName = "com.mySql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/student";
	String userName = "root";
	String password = "root";
	public static ConnectionFactory connectionFactory = null;

	public ConnectionFactory() {
		// TODO Auto-generated constructor stub

		try {
			Class.forName(driverclassName);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getConnection() throws SQLException {
		Connection connection = null;
		connection = DriverManager.getConnection(url, userName, password);
		return connection;
	}

	public static ConnectionFactory getConnectionFactory() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();

		}
		return connectionFactory;

	}

}
