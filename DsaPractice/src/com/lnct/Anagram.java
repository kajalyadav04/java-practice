package com.lnct;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		if(anagramFunction(str1, str2)) {
			System.out.println("y");
		}
		else {
			System.out.println("n");
		}
	}

	private static boolean anagramFunction(String str1, String str2) {
		// TODO Auto-generated method stub
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
//		System.out.println(str1);
//		System.out.println(str2);
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
//		System.out.println(arr1);
//		System.out.println(arr2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);

//		System.out.println(arr1);
//		System.out.println(arr2);
		return Arrays.equals(arr1, arr2);
	}

}