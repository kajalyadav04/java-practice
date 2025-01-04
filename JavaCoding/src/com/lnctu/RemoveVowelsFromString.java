package com.lnctu;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="abcd all  form that";
 String replaceStr=str.replaceAll("[AEIOUaeiou]", " ");
 System.out.println(replaceStr);

	}

}
