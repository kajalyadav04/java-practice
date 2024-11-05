package com.tcs;
	import java.util.*;
	
	public class RemoveBracketsFromAlgebraicExpression {  
	    public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
	        String s=sc.nextLine();
	        String result=removebra(s);
	        System.out.println(result);
	    }
	    public static String removebra(String s){
	           String newString=s.replaceAll("[{}()\\[\\]]","");
	          return newString;    
	    }
	}
