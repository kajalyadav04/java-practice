package com.lnct;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5, 6 };
		int n = arr.length;
		int k = MissingNum(arr, n);
		System.out.println(k);

	}

	private static int MissingNum(int[] arr, int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int naturalSum = (n + 1) * (n + 2) / 2;
		int res = naturalSum-sum;
		return res;
	}

}
