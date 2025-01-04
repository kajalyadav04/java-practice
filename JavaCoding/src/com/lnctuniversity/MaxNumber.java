package com.lnctuniversity;

public class MaxNumber {

	public static void main(String[] args) {
	    int arrs[]={7,4,9,2,9};
	    int max=arrs[0];
		for(int i=1;i<arrs.length;i++){
		    if(max<arrs[i]){
		        max=arrs[i];
		    }
		}
		System.out.print(max);
	}
}
