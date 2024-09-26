package com.lnct;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 28;

		boolean res =perfect_Num(num);
		System.out.println(res);
	}

	private static boolean perfect_Num(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return true;
		}
		return false;
	}
}
