package com.lnct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		count(n);
	}

	public static void count(String str) {
		Map<Character, Integer> aMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (aMap.containsKey(c)) {
				aMap.put(c, aMap.get(c) + 1);
			} else {
				aMap.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> aEntry : aMap.entrySet()) {
			System.out.print(aEntry.getKey() + "" + aEntry.getValue());
		}

	}

}
