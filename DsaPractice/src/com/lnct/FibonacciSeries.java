package com.lnct;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b= sc.nextInt();
	    fibonacci(n,a,b);

	}

	private static void fibonacci(int n,int a,int b) {
		// TODO Auto-generated method stub
		
		
		
		System.out.print(a+" "+b+" ");
		int sum=0;
		for(int i=2;i<n;i++) {
		 
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
			
	}
	

}
