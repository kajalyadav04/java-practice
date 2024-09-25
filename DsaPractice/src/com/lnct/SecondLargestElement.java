package com.lnct;

import java.util.Arrays;

public class SecondLargestElement {
	public static int[] maxele(int[] arr, int n) {
		int max = -100000;
		int index = 0;
		int array[] = new int[2];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}

		}
		array[0]=index;
		array[1]=max;
		return array;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 9, 2,72, 78, 1 };
		int n = arr.length;
//		maxele(arr,n);
		int array[] = new int[n];
		
		int count=0;
		int array1[] = maxele(arr, n);
		for (int i = 0; i < n; i++) {
			
			if ((i == array1[0])) {
				continue;
			} else{
				array[i]=arr[i];
			}
		}
		int array2[] = maxele(array, n);
		System.out.println(array2[1]);
	}
	

}
