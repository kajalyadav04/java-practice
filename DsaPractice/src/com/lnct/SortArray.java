package com.lnct;

import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class SortArray {
	public static int[] sortArray(int[] array, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

//			System.out.print(array[i]);
		}

		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu3b
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		try {
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
//		for (int j = 0; j <n; j++) {
//			System.out.print(arr[j]);
//
//		}

//		System.out.println(Arrays.toString(A));
		int[] array1= sortArray(arr, n);
		System.out.println(Arrays.toString(array1));

	}

}
