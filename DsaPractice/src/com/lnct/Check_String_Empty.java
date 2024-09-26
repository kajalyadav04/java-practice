package com.lnct;

public class Check_String_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="k";
		boolean k= check_String_Empty(string);
		System.out.println(k);

	}

	private static boolean check_String_Empty(String str) {
		// TODO Auto-generated method stub
		str=str.replaceAll("//s","");
		char[] charArr=str.toCharArray();
		int count=0;
		if(charArr.length==0) {
			return true;
		}
		return false;
	}

}
