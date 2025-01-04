package com.lnctuniversity;

public class ReverseNumbern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=102;
 int rev=0;
 while(num>0) {
	 int rem=num%10;
	 rev=rev*10+rem;
	 num=num/10;
	 
 }
 System.out.println("reverse number"+" "+rev);
	}

}
