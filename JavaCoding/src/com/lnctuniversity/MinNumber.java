package com.lnctuniversity;

public class MinNumber {
	public static void main(String[] args) {
	    int arrs[]={7,4,9,2,9};
	    int min=arrs[0];
		for(int i=1;i<arrs.length;i++){
		    if(min>arrs[i]){
		        min=arrs[i];
		    }
		}
		System.out.print(min);
}
}