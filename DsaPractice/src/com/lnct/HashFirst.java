package com.lnct;

import java.util.Scanner;

public class HashFirst {
	public static void main(String[] args) {
// 		
   Scanner sc = new Scanner(System.in);
   String a = sc.next();
   int len = a.length();
//   String b =
  hash(a,len);
//   System.out.println(b);
   
	}

  public static void hash(String str, int n){
     String str1 = "";
     String str2 = "";
     for(int i=0;i<n;i++){
         if(str.charAt(i)=='#'){
            str1=str1+"#";
            
         }
        else{
         str2=str2+str.charAt(i);
        }
     
     
     }
    String s = str1.concat(str2);
    // return s;
    System.out.println(s);
 }

}
