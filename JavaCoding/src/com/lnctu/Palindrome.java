package com.lnctu;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "madam";
  String reversed = new StringBuilder(str).reverse().toString();
 System.out.print(str.equals(reversed));
	}

}
