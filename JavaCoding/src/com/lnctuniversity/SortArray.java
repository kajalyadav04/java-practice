package com.lnctuniversity;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,7,8,6,2};
		int temp;
 for(int i=0;i< arr.length;i++) {
	 for(int j=i+1;j<arr.length;j++) {
		if(arr[j]>arr[i]) {
			temp=arr[i];
			arr[i]=arr[j];
		}
	 }
 }
 System.out.println(Arrays.toString(arr));
	}

}
