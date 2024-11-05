package com.tcs;
import java.util.*;
public class ReverseString {
public static void main (String args[]){
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
  String revernew= reverseString( str);
  System.out.println(revernew);
    
}
public static String reverseString(String str){
    String reverseStr="";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        reverseStr=ch+reverseStr;
    }
    return reverseStr;
}
}