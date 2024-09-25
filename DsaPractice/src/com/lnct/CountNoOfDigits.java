package com.lnct;

public class CountNoOfDigits {
	public static int count(long n) {
		int count = 0;
		while (n > 0) {
//			
			n = n / 10;
			count++;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 546789065987654l;
		int res = count(n);
		System.out.println(res);

	}

}
