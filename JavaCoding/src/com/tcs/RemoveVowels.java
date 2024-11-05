package com.tcs;
import java.util.*;
public class RemoveVowels {
public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    String result=( removeVowels(str));
   System.out.println(result);
}
public static String removeVowels(String str){
    StringBuilder sb=new StringBuilder();
   for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
           sb.append(ch);
       }
}
return  sb.toString();
}
}