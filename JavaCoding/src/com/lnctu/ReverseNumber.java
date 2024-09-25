package com.lnctu;

import java.io.Closeable;
import java.util.Scanner;

public class ReverseNumber {
public static void main(String []args) {
	int reverse=0;
	System.out.println("enter num:");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	while(num>0) {
	int rem=num%10;
     reverse= (reverse*10)+rem;
	num=num/10;
}
System.out.println("reverse="+reverse);
}
}