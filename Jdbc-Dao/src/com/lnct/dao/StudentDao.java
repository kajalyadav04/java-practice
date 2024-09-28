package com.lnct.dao;

import java.awt.Button;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lnct.entity.StudentBean;
import com.lnct.utility.ConnectionFactory;
import com.mysql.cj.xdevapi.PreparableStatement;

public class StudentDao {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	private Connection getConnection() throws SQLException {
		connection = ConnectionFactory.getConnectionFactory().getConnection();
		return connection;
	}

	public void addStudent(StudentBean studentBean) {
		String queryString = "INSERT INTO student(roll, name, address, mobile,marks)VALUES (?,?,?,?,?)";
		System.out.println(studentBean);
		System.out.println("query: " + queryString);
		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setInt(1, studentBean.getRoll());
			preparedStatement.setString(2, studentBean.getName());
			preparedStatement.setString(3, studentBean.getAddress());
			preparedStatement.setInt(4, studentBean.getMobile());
			preparedStatement.setInt(5, studentBean.getMarks());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void updateStudentInfo(int roll, String name) {
		// TODO Auto-generated method stub
		String queryString = "UPDATE student SET name=? WHERE roll=?";
		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement(queryString);
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, roll);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {

					connection.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
