package com.lnct;

import java.util.Scanner;

public class ReverseNum {
	  
       public static int reverse(int n) {
    	   int rev=0;
    	   while(n>0) {
    		  int rem=n%10;
    		  rev= rev*10+rem;
    		  n=n/10;
    	   }
    	   return rev;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k=reverse(n);
		System.out.println(k);

	}

}
