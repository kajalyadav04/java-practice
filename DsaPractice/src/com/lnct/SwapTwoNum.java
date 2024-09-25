package com.lnct;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		int m = 72;
		swapByTemp(n, m);

	}

	private static void swapByTemp(int n, int m) {
		// TODO Auto-generated method stub
		int temp = n;
		n = m;
		m = temp;
		System.out.println("n: " + n + "m: " + m);
	}

}
