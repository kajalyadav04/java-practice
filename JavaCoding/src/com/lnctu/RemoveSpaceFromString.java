package com.lnctu;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
String str=scanner.nextLine();
System.out.println(str.replaceAll("\\s",""));
	}

}
