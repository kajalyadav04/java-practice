package com.tcs;
import java.util.*;
public class CountNoVowelConsonantSpaces {
public static  void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str= sc.next();
  String vowelses=vowels(str);
   System.out.println(vowelses);
}
public static String vowels(String str){
    String newString="";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        continue;
    }
    else{
      newString+=ch; 
    }
    }
    return newString;
}

}