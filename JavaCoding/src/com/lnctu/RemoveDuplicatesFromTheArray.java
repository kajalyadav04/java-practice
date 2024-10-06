package com.lnctu;

import java.util.HashSet;

public class RemoveDuplicatesFromTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,3,4,4,5,7};
       HashSet<Integer> s=new HashSet<Integer>();
       for(int n:arr) {
    	   s.add(n);
       }
      System.out.println(s); 
	}

}
