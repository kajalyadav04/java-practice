package com.lnct;

public class Common_Element_In_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {33,76,3,4,6,7};
		int[] arr2= {38,76,3,6,79,};
		common_Element_Arrays(arr1,arr2);

	}
	public static void common_Element_Arrays(int[] arr1,int[] arr2) {
//		int[] array=new int[arr1.lenth]
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
				
			}
		}
	}

}
