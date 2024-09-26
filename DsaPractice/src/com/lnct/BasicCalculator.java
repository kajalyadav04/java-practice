package com.lnct;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("if you want to stop your calcultor press 0");
		
		int n ;
		
		do {
		
		System.out.println("num1: ");
		Double num1 = sc.nextDouble();
		System.out.println("num2: ");
		Double num2 = sc.nextDouble();
		System.out.println("opertor");
		char ch = sc.next().charAt(0);
		calculator(num1, num2, ch);
		System.out.println("if you want to stop your calcultor press 0 otherwise another number ");
		 n = sc.nextInt();
		}while(n!=0);
		
		System.out.println("calcultator stopped");
	}

	public static void calculator(double num1, double num2, char ch) {
		double result;
		switch (ch) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
		default:

			System.out.println("choose correct symbol or opertor");
//			calculator( num1,  num2, ch);
			break;

		}

	}

}
