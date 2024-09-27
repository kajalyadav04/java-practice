package com.lnct;

import java.util.HashSet;
import java.util.Set;

public class Common_Element_In_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {33,76,3,4,6,7};
		int[] arr2= {38,76,3,6,79,};
//		common_Element_Arrays(arr1,arr2);
		common_Element_Arrays_Collection(arr1,arr2);

	}
	private static void common_Element_Arrays_Collection(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static void common_Element_Arrays(int[] arr1,int[] arr2) {

		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
				
			}
		}
	}

}
