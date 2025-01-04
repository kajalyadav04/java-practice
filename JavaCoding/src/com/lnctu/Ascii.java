package com.lnctu;
import java.util.Scanner;

public class Ascii {
	public static void findAscii(char character) {
		int ascii=(int)character;
		System.out.println(ascii);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
		char Character =sc.next().charAt(0);
		findAscii( Character );
	}

}
