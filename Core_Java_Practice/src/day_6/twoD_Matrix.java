package day_6;

import java.util.Scanner;

public class twoD_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sumL=0;
		int sumR=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					sumL+=arr[i][j];
					
				}
				if(i+j==m-1) {
					sumR+=arr[i][j];
				}
			}
		}
		System.out.println(sumL-sumR);
		
		
	}

}
