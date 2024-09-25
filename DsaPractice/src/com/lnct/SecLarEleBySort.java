package com.lnct;

import java.util.Arrays;
import java.util.Scanner;

public class SecLarEleBySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 65, 78, 98 };
		int result = SecLarEleBySort(arr);
		System.out.println(result);
		int res = secLarEleBySortFn(arr);
		System.out.println(res);
	}

	private static int SecLarEleBySort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(arr));
		for (int k = n - 1; k > 0; k--) {
			if (arr[k] != arr[k - 1]) {
				return arr[k - 1];

			}

		}
		return -1;
	}

	public static int secLarEleBySortFn(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		for (int i = n - 1; i > 0; i++) {
			if (arr[i] != arr[i - 1]) {
				return arr[i - 1];
			}
		}

		return -1;

	}

}
