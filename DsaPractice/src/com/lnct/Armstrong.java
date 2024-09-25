package com.lnct;

import java.util.Scanner;



public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(armstrong(n));

	}

	public static int order(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	private static boolean armstrong(int n) {
		// TODO Auto-generated method stub
        int l = n;
		int k = order(n);
		double arm = 0.0;
		while (n > 0) {
			int rem = n % 10;
			arm = arm + (Math.pow(rem, k));

			n = n / 10;
		}
//		System.out.println(arm);
		if (l == arm) {
			return true;
		} else {
			return false;
		}

	}

}
