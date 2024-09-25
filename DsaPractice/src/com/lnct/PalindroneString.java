package com.lnct;

import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class PalindroneString {
	public static String plaindrone(String s) {
//		char[] charArr= s.toCharArray();
//	   String kString="";
//		for(int i=charArr.length-1;i>=0;i--){
//			kString+=charArr[i];
//		}
		StringBuilder str1 = new StringBuilder(s);
		str1=str1.reverse();
		System.out.println(str1);
		System.out.println(s);
		if(s.equals(str1.toString())) {
			return "Yes";
		}
		else {
			return "No";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String kString=plaindrone(str);
        System.out.println(kString);
	}

}
