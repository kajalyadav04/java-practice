package com.lnct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int arr[] = { 9, 8, 9, 9, 4, 89, 2, -9 };
		int n = arr.length;
//		Set<Integer> aIntegers = remove(arr, n);
//		System.out.println(aIntegers);
//		remDup(arr, n);
		remarr(arr, n);
	}

	private static void remarr(int[] arr, int n) {
		// TODO Auto-generated method stub
		int count = 0;
		int[] array = new int[n];
		boolean d;
		for (int i = 0; i < n; i++) {
			d = false;
			for (int k = 0; k < count; k++) {
				if (arr[i] == arr[k]) {
					d = true;
//					System.out.println(arr[i]);
					break;
				}

			}
			if (!d) {
				array[count] = arr[i];
				System.out.println(array[count]);
				count++;

			}
		}
	}

	private static Set<Integer> remove(int[] arr, int n) {
		// TODO Auto-generated method stub
		Set<Integer> unique = new HashSet<>();
		for (int i = 0; i < n; i++) {
			unique.add(arr[i]);
		}
		return unique;
	}

	public static void remDup(int[] arr, int n) {
		int count = 0;
		Arrays.sort(arr);
		;
		int[] array = new int[n];
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				array[count] = arr[i];
				System.out.println(array[count]);
				count++;
			}

		}
		arr[count] = arr.length - 1;
	}
}
