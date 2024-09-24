package com.masai.demo;

import java.util.HashSet;
import java.util.Set;

import com.mysql.cj.QueryReturnType;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int arr[] = { 8, 9, 9, 4, 89, 2, -9 };
		int n = arr.length;
		Set<Integer> aIntegers = remove(arr, n);
		System.out.println(aIntegers);

	}

	private static Set<Integer> remove(int[] arr, int n) {
		// TODO Auto-generated method stub
		Set<Integer> unique = new HashSet<>();
		for (int i = 0; i < n; i++) {
			unique.add(arr[i]);
		}
		return unique;
	}
}
