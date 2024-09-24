package com.masai.demo;

import java.util.Scanner;

import com.mysql.cj.QueryReturnType;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == armstrong(n)) {
			System.out.println("yes");
		} else {
			System.out.println("No");

		}
	}

	public static int order(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	private static double armstrong(int n) {
		// TODO Auto-generated method stub

		int k = order(n);
		double arm = 0.0;
		while (n > 0) {
			int rem = n % 10;
			arm = arm + (Math.pow(rem, k));

			n = n / 10;
		}
//		System.out.println(arm);
		return arm;
	}

}
