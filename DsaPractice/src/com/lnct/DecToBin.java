package com.lnct;

import java.util.Arrays;

public class DecToBin {
	// Decimal to Binary
	public static String decimalToBinary(int n) {
		String binString="";
		StringBuilder stringBuilder = new StringBuilder("");
//		int[] arr= new i
		while(n>0) {
			int rem=n%2;
			stringBuilder.append(rem);
//			i++;
			n=n/2;	
		}
//		System.out.println(Arrays.toString(arr));
		 return stringBuilder.reverse().toString();
		
//		return binString;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int n = 30;
		String res=decimalToBinary(n);
		System.out.println(res);
	}

}
