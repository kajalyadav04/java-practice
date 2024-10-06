package com.lnctu;

import java.util.Scanner;

public class Table {
	public  void table(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(i*num));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the Number ");
  int num =sc.nextInt();
  Table t=new Table();
  t.table(num);
	}

}
