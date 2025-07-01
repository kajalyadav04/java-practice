package com.day_13;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatter {
	public static void main(String args[]) {
	Date date= new Date();
	System.out.println(date);
	SimpleDateFormat dateFormat=new SimpleDateFormat("EEEE");
	System.out.println(dateFormat.format(date));
	

}
}
