package com.lnctu;
import java.util.Scanner;

public class SwapTwoNumber {
	public  static void swapNumber() {
	
		System.out.println("inter number a,b:");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		 int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		
     swapNumber();

	}

}
