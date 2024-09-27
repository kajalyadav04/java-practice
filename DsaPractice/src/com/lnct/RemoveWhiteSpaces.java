package com.lnct;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string=" remove white spaces";
      System.out.println(removeWhiteSpaces(string));
	}

	private static String removeWhiteSpaces(String str) {
		// TODO Auto-generated method stubS
		String emp="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				emp+=str.charAt(i);
				
			}
		}
		return emp;
	}

}
