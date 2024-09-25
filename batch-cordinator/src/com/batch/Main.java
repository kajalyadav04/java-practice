package com.batch;

import java.util.Scanner;

import com.batch.exception.InvalidException;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;

		System.out.println("Welcome to batch Management System");
		try {

			do {

				System.out.println("Enter Your Preferences, What do you want ," + "\n"
						+ "Press '1' -_-_-> For Admin Login" + "\n" + "Press '2' -_-_-> For Faculty Login ," + "\n"
						+ "Press '3' -_-_-> For Faculty SignUp ," + "\n" + "Press '0' -_-_-> For Existing the System. "
						+ "\n");
				input = sc.nextInt();
				switch (input) {
				case 1:
					admin();
					break;
				case 2:
					faculty();
					break;
				case 3:
					facultySignup();
					break;
				case 0:
					System.out.println("Successfully Existed from the System");
					break;
				default:
					throw new InvalidException("invalid option selected");
				}
			} while (input != 0);
		} catch (Exception e) {
			System.out.println("error :" + e.getMessage());

		}

	}

	private static void facultySignup() {
		// TODO Auto-generated method stub

	}

	private static void faculty() {
		// TODO Auto-generated method stub

	}

	private static void admin() {
		// TODO Auto-generated method stub

	}

}
