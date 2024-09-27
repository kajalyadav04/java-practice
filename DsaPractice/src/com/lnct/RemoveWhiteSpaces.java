package com.lnct;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string=" remove white spaces";
      System.out.println(removeWhiteSpaces(string));
      remove_Spaces_Using_Inbuild(string);
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
	public static void remove_Spaces_Using_Inbuild(String str) {
		String str1 =str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
