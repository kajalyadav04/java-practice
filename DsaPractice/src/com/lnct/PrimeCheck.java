package com.lnct;

import java.util.Scanner;

public class PrimeCheck {
	public static void prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		prime(a);

	}

}
