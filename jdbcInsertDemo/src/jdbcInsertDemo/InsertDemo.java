package jdbcInsertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con	 =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "root");
	PreparedStatement ps=con.prepareStatement("insert into student values(29,'Rakesh kumar','jharkhand','568831','450')");
	int i=ps.executeUpdate();
	if(i>0) {
		System.out.println("Success");
	}
	else {
		System.out.println(" Not Success");
	}
	}
}
