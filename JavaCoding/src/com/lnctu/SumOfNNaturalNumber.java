package com.lnctu;

import java.util.Scanner;

public class SumOfNNaturalNumber {
	public static void SumOfNNatural(int num,int sum) {
		for(int i=1;i<=num;i++) { 
			 sum=sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
			int num =sc.nextInt();
			int sum=0;
			SumOfNNatural(num,sum);
			
		}
	}


