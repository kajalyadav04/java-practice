package com.lnctu;

import java.util.HashSet;
import java.util.Iterator;

public class CommonElementsInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]	= {1,2,3,3,4,5,6,7};
      int arr1[]= {4,5,6,7,8,9,88};
      HashSet<Integer> set=new HashSet<>();
      for(int num: arr) {
    	  set.add(num);
      }
      System.out.println(set);
      for(int num:arr1) {
    	  if(set.contains(num)) {
    		  System.out.print(num+" ");
    	  }
		
	}
      
	}
     
	}
	


