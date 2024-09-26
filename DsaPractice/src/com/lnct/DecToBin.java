package com.lnct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DecToBin {

	public static String decimalToBinary(int n) {
		String binString = "";
		StringBuilder stringBuilder = new StringBuilder("");

		while (n > 0) {
			int rem = n % 2;
			stringBuilder.append(rem);
			n = n / 2;
		}

		return stringBuilder.reverse().toString();

	}

	private static void decToBinUsingList(int n) {
		// TODO Auto-generated method stub
		List<Integer> arrList = new ArrayList<>();
		int i = 0;
		while (n > 0) {
			int rem = n % 2;
			arrList.add(rem);
			i++;
			n = n / 2;
		}
		for (int k = i - 1; k >= 0; k--) {
			System.out.print(arrList.get(k));
		}
//		System.out.println(arrList);

	}

	private static void deciToBinUsingArray(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[1000];
		int i = 0;
		while (n > 0) {
			int rem = n % 2;
			arr[i] = rem;
			i++;
			n = n / 2;
		}
		for (int k = i - 1; k >= 0; k--) {
			System.out.print(arr[k]);
		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int n = 30;
		String res = decimalToBinary(n);
		System.out.println(res);
		deciToBinUsingArray(n);
		System.out.println();
		decToBinUsingList(n);

	}

}
