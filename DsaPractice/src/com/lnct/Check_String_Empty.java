package com.lnct;

public class Check_String_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = " ";
		boolean k = check_String_Empty(string);
		System.out.println(k);
		boolean l = isEmptyUsingCharAt(string);
		System.out.println(l);
		boolean p = check_String_Empty_isEmptyFn(string);
		System.out.println(p);
		check_String_Empty_isEmptyFn(string);
		boolean kString = string_Empty(string);
		System.out.println(kString);

	}

	private static boolean check_String_Empty_isEmptyFn(String str) {
		// TODO Auto-generated method stub
		if (str.isEmpty()) {
			return true;
		}
		return false;
	}

	private static boolean isEmptyUsingCharAt(String str) {
		// TODO Auto-generated method stub
		try {
			char a = str.charAt(0);
		} catch (Exception e) {
			// TODO: handle exception
			return true;
		}
		return false;
	}

	private static boolean string_Empty(String str) {
		// TODO Auto-generated method stub
		str = str.replaceAll("\\s", "");

		for (int i = 0; i < str.length(); i++) {
			return false;
		}
		return true;
	}

	private static boolean check_String_Empty(String str) {
		// TODO Auto-generated method stub
		str = str.replaceAll("\\s", "");
		char[] charArr = str.toCharArray();

		if (charArr.length == 0) {
			return true;
		}
		return false;
	}

}
