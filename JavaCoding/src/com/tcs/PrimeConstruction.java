package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeConstruction {

	public static void main(String[] args) {
///TODO Auto-generated method stub
		// Enter code here
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		int m = n + 1;
		int[] arr = { 3, 4, 5, 1 };

//		for (int k = 0; k < n; k++) {
//			arr[k] = sc.nextInt();
//		}
//
////		System.out.println("arr" + Arrays.toString(arr));
////		minimum(arr);
//		boolean k = primeNum(7);
//		System.out.println(k);
		PrimeConstruction(arr);
	}

	private static void PrimeConstruction(int[] arr) {

		// TODO Auto-generated method stub
		int k = minimum(arr);
		System.out.println(k);
		int j = 0;

		for (j = k; j < 100; j++) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == k) {
					continue;
				} else {
					if (j % arr[i] == k && primeNum(j)) {
						count++;
//						System.out.println("j" + j);
//						System.out.println("k" + k);
//						System.out.println("arr[i]" + arr[i]);
					}
				}
			}
			if (count == arr.length - 1) {
				System.out.println(j);
				return;
			}

		}

	}

	private static boolean primeNum(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

	private static int minimum(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;

	}

}
