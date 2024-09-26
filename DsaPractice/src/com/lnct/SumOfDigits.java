package com.lnct;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3456;
		int res=sumDigits(n);
		System.out.println(res);
	}

	private static int sumDigits(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		return sum;
	}

}
