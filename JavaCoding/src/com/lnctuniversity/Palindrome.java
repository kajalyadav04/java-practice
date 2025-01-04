package com.lnctuniversity;
import java.util.Scanner;
public class Palindrome {
	public static boolean palindrome(int number) {
		int original=number;
		int reverse=0;
		while(number>0) {
			int rem=number%10;
			reverse=reverse*10+rem;
		    number=number/10;
	}
		return reverse==original;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
if(palindrome(number)) {
	System.out.println("Palindrome Number");
}
else {
	System.out.println("Not Palindrome Number");
}
	}

}
