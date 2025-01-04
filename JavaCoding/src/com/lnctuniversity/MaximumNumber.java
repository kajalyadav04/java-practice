package com.lnctuniversity;

import java.util.Scanner;

import java.util.Arrays;

public class MaximumNumber {
public static void 	maximumNumber(int arrs[]) {
	int temp;
	for(int i=0;i<=arrs.length-1;i++) {
		for(int j=i+1;j<=arrs.length-1;j++) {
			if(arrs[i]<arrs[j]) {
				temp=arrs[i];
				arrs[i]=arrs[j];
				arrs[j]=temp;
			}
		}
	}
	System.out.println("Array"+Arrays.toString(arrs));
	System.out.println("Maximum Number"+arrs[0]);
	System.out.println("Minimum Number"+arrs[arrs.length-1]);
}
public static void main(String args[]) {
	int arrs[]=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<arrs.length;i++)
	arrs[i]=s.nextInt();
	maximumNumber(arrs);
}
	

}
