package com.lnct;

import java.util.Scanner;

import com.lnct.entity.StudentBean;
import com.lnct.service.StudentService;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		do {
			System.out.println("Enter Your Preferences, What do you want ," + "\n" + "Press '1' -_-_-> To Insert Student"
					+ "\n" + "Press '2' -_-_-> To update record of student ," + "\n" + "Press '3' -_-_-> To update record of student ,"
					+ "\n" + "Press '0' -_-_-> For Existing the System. " + "\n");
			option = scanner.nextInt();

			switch (option) {
			case 1:

				insertStudent(scanner);

				break;
			case 2:
				updateStudent(scanner);
				break;
			case 3:
				deleteStudent(scanner);
			case 0:
				System.out.println("exit");
				break;
			default:
				System.out.println("choose correct option");

			}
		} while (option != 0);
	}

	private static void deleteStudent(Scanner scanner) {
		// TODO Auto-generated method stub
		StudentService service = new StudentService();
		System.out.println("enter roll");
		int roll = scanner.nextInt();
		service.deleteStudentRecord(roll);
		
	}

	private static void updateStudent(Scanner scanner) {
		// TODO Auto-generated method stub
		StudentService service = new StudentService();
		System.out.println("enter roll");
		int roll = scanner.nextInt();
		System.out.println("enter name");
		String name = scanner.next();
		service.updateStudentData(roll,name);
		
	}

	private static void insertStudent(Scanner scanner) {
		// TODO Auto-generated method stub

		StudentService service = new StudentService();
		System.out.println("enter roll");
		int roll = scanner.nextInt();
		System.out.println("enter name");
		String name = scanner.next();
		System.out.println("enter address");
		String address = scanner.next();
		System.out.println("enter mobile");
		int mobile = scanner.nextInt();
		System.out.println("enter marks");
		int marks = scanner.nextInt();
		StudentBean studentBean=new StudentBean(roll, name, address, mobile, marks);
		service.insertData(studentBean);

	}

}
