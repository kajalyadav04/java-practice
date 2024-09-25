package com.lnct;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 9, 4, 89, 2,-9 };
		int n = arr.length;
		System.out.println(largestElement(arr, n));
	}

	private static int largestElement(int[] arr, int n) {
		// TODO Auto-generated method stub
		int largest = -10000;
		int small=10000;
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
			

		}
		System.out.println(small);
		return largest;
	}

}
