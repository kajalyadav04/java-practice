package day_01;

import java.util.Scanner;

public class PrintName {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String address = sc.nextLine();
		printfn(name,address);
		
		
	}
	public static void printfn(String name,String address) {
		System.out.println("This is My First Java Application");
		System.out.println("==================================");
		System.out.println("My Name is:"+name);
		System.out.println("My Address is:"+address);	
	}

}
