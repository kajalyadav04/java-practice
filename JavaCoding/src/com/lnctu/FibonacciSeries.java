package com.lnctu;

import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {

	int a=0,b=1;
	System.out.print("enert num");
Scanner sc = new Scanner(System.in);
 int num=sc.nextInt();
 System.out.print(a+" "+ b+" ");
	for(int i=2;i<=num;i++)	 {
		int c= a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	
}
	
}