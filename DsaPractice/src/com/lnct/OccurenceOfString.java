package com.lnct;

public class OccurenceOfString {
	// count occurence of character in string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aaaanjali";
		char ch = 'n';
		occurenceOfString(string, ch);

	}

	private static void occurenceOfString(String str, char ch) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {
				c++;
			}

		}
		System.out.println(c);
	}

}
