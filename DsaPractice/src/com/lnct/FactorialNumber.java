package com.lnct;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial(n);
	}

	public static void factorial(int n) {
		int mul=1;
		for (int i = 1; i <= n; i++) {
			mul = mul * i;
		}
		System.out.println(mul);

	}
}
