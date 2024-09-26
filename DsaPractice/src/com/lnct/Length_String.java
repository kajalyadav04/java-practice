package com.lnct;

public class Length_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="pvss dav  school";
		int count =length_String( string);
		System.out.println(count);

	}

	private static int length_String(String string) {
		// TODO Auto-generated method stub
	  string= string.replaceAll("\\s", "");
		char[] charArr=string.toCharArray();
		int count=0;
		for(int i=0;i<charArr.length;i++) {
			count++;
		}
		return count++;
	}
	

}
