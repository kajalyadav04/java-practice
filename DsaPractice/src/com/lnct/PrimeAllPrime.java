package com.lnct;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class PrimeAllPrime {
	public static String prime(int k) {
		if(k==1) {
			return "no";
		}
		else {
			for(int i=2;i<k;i++) {
				if(k%i==0) {
					return "no";
				}
			}
			return "yes";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			String rString=prime(i);
        if(rString.equalsIgnoreCase("Yes")){
        	System.out.println(i);
        }
        
	}

}
}
