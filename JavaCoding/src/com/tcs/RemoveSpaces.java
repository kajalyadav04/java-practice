package com.tcs;
	import java.util.*;
	public class RemoveSpaces {
	public static void main (String args[]){
	    Scanner sc= new Scanner(System.in);
	    String str=sc.nextLine();
	   System.out.println( removeSpaces(str));
	}
	public static String removeSpaces(String str){
	   String newString= str.replaceAll("\\s","");
	   return newString;
	}
	}