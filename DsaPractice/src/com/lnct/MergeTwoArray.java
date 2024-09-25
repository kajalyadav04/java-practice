package com.lnct;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 8, 6, 2 };
		int[] arr2 = { 7, 1, 5 };
		merge(arr1, arr2);

	}

	private static void merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int n = arr1.length;
		int m = arr2.length;
		int[] arr = new int[n + m];
		int count=0;

				for (int j = 0; j < n; j++) {
					arr[count] = arr1[j];

					count++;
				}

				for (int k = 0; k < m; k++) {
					arr[count] = arr2[k];

					count++;
				}


		System.out.println(Arrays.toString(arr));
	}

}
