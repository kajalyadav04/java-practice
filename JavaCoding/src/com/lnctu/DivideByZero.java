package com.lnctu;

import java.util.Scanner;

class DivideByZero {
    public static void DivideByZeroException(int n) {
    	try {
			System.out.println(n/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    	System.out.println("complete");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter number:");
          Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
          DivideByZeroException(n);
	}

}
