package com.lnctu;

import java.lang.reflect.Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr []= {22,14,16,12,19,40};
 int n= arr.length;
     for(int i=0;i< n-1;i++) {
    	for(int j=0;j< n-i-1;j++) {
    		if(arr[j]>arr[j+1]) {
    			int temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    		}
      }
     }
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
	}
	}
}
