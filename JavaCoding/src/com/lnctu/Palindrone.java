package com.lnctu;

import java.util.Scanner;

public class Palindrone {
	
public static String palindroneCheck(String str ) {
	
  String stringConvert=str.toLowerCase();
  String reverseSring= new StringBuilder(stringConvert).reverse().toString();
  if(stringConvert.equals(reverseSring)) {
	System.out.println("yes");	
	}		
  else {
	System.out.println("no");
}
	return stringConvert;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
				String str=sc.nextLine();
		palindroneCheck(str);	
	sc.close();
	}
	

}
