package jdbcInsertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo2 {

	public static void main(String[] args)throws Exception
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll: ");
		int roll= sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name= sc.next();
		
		System.out.println("Enter Address: ");
		String address= sc.next();
		
		System.out.println("Enter moblie: ");
		String mobile= sc.next();
		System.out.println("Enter Marks: ");
		int marks= sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con	 =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "root");
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
	ps.setInt(1, roll);
    ps.setString(2, name);
    ps.setString(3, address);
    ps.setString(4, mobile);
    ps.setInt(5, marks);
	int i=ps.executeUpdate();
	if(i>0) {
		System.out.println("Success");
	}
	else {
		System.out.println(" Not Success");
	}
	}
}
