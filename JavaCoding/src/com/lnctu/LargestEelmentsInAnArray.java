package com.lnctu;

import java.util.Scanner;

public class LargestEelmentsInAnArray {
	public static void LargestEelmentsArray() {
		int arr[]= {1,3,5,8,4,7};
		int largest=arr[0];
		for(int n:arr){
			if(n>largest) {
				largest=n;
			}
			
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		LargestEelmentsArray();
	}

}
