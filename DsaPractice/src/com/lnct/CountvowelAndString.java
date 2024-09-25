package com.lnct;

import java.util.Scanner;

public class CountvowelAndString {
	public static void countVowel(String str) {

		int vowelc = 0;
		int consc = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (('a' == ch) || ('e' == ch) || ('i' == ch) || ('o' == ch) || ('u' == ch)) {
				vowelc++;
			}
			else {
				consc++;
			}
			
		}
		System.out.println("vowel "+vowelc);
		System.out.println("cons "+consc);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		countVowel(s);

	}
}
