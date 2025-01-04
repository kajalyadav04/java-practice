package com.lnctuniversity;
	import java.util.Scanner;
	public class ReverseNumber {
	    public static String ReverseNumber(String stre){
	      String rev="";
	      for(int i=stre.length()-1;i>=0;i--){
	          rev+=stre.charAt(i);
	      }
	      return rev;
	    }
	public static void main (String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter String");
	   String stre= sc.nextLine();
	   System.out.println(ReverseNumber(stre));
	}
	}

