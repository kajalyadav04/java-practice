package com.lnctu;

import java.util.Scanner;

public class SumOfNumberInString {
	int sum=0;
	
	public static void sumOfNo(String str,int sum) {
		int num=Integer.parseInt(str);
		while(num>0) {
			int rem=num%10;
		
		sum=sum+rem;
		num=num/10;
	}
	System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		String str=scanner.next();
		// String str="123";
		sumOfNo(str,0);
	}

}
