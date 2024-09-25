package com.lnct;

import java.util.Scanner;

public class GcfTwoNum {
	public static int gcd(int n, int m) {
		int res = Math.min(n, m);
		while (res > 0) {

			if (n % res == 0 && m % res == 0) {
				break;
			} else {
				res--;
			}
			
		}
		return res;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		
		int res=gcd(n,m);
		System.out.println(res);

	}

}
