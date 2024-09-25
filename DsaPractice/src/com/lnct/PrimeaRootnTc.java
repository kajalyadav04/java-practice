package com.lnct;

import java.util.Scanner;

public class PrimeaRootnTc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String string=PrimeCheck(a);
		System.out.println(string);

	}

	private static String PrimeCheck(int a) {
		// TODO Auto-generated method stub
		if (a == 1) {
			return "no";
		} else {
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0) {
					return "no";
				}

			}
			return "yes";
		}

	}

}
