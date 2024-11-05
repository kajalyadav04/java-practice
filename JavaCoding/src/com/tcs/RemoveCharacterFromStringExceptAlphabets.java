package com.tcs;
import java.util.*;

public class RemoveCharacterFromStringExceptAlphabets {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String result=removeCharacter(s);
        System.out.println(result);
    }
    public static String removeCharacter(String s){
        String newl="";
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(Character.isLetter(ch)){
               newl+=ch;
           }
        }
        return newl;            
    }
}