package com.lnct;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str) {
		char[] charArr=str.toCharArray();
		int n = charArr.length;
		String string1="";
//		System.out.println(n);
		for(int i=n-1;i>=0;i--) {
			 string1=string1+charArr[i];
		}
		return string1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String kString=reverse(s);
        System.out.println(kString);
        
	}

}
