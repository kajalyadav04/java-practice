package com.lnctuniversity;

import java.util.Scanner;
import java.util.Arrays;;

public class SecondlargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter arr");
int arr[]= new int[5];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int temp;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
	if(arr[i]<arr[j]) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	}
}
System.out.println(Arrays.toString(arr));
System.out.println("second largest elemt of arrays"+" "+arr[1]);
}

}
