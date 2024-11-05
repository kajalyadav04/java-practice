package com.tcs;

import java.util.Scanner;

public class RemoveBrackets {
	public static void main (String[] args) {
		 Scanner sc= new Scanner(System.in);
		 String s=sc.nextLine();
		 String k=removeBrackets(s);
		 System.out.println(k);
		}
		public static String removeBrackets(String s){
		    return s.replaceAll("[(){}\\[\\]]","");
		}

}
