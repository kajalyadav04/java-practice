package com.tcs;
import java.util.*;
public class Asciivalue {
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   char ch= sc.next().charAt(0);
 int asccivale=  asci(ch);
   System.out.println(asccivale);
} 
public static int asci(char ch){
    int n=(int)ch;
    return n;
}
}