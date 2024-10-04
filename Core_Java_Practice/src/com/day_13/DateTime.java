package com.day_13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dobString=scanner.next();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			
			LocalDate lDate=LocalDate.parse(dobString, dateTimeFormatter);
			System.out.println(lDate);
			DateTimeFormatter dayDateTimeFormatter= DateTimeFormatter.ofPattern("EEEE");
			String ldateString = lDate.format(dayDateTimeFormatter);
			System.out.println(ldateString);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("please provide correct date time format");
		}
		

	}

}
