package com.lnctu;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pascalNum(n);

	}

	private static void pascalNum(int n) {
		// TODO Auto-generated method stub
		int number = 1;
		int spaces = 4;
		for (int i = 0; i < n; i++) {
			number = 1;
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(number + " ");
				number = number * (i - k) / (k + 1);

			}
			spaces--;
			System.out.println();
		}

	}

}
