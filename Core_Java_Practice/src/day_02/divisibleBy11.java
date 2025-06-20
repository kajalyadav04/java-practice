package day_02;

import java.util.Scanner;

public class divisibleBy11 {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
//		 int n = sc.nextInt();
		int n=9780;
		 Boolean k= div11Fn(n);
		System.out.println(k);
	 }
	 public static Boolean div11Fn(int n) {
		 int i=0;
		 int eSum=0;
		 int oSum=0;
		 while(n>0) {
			 int rem=n%10;
			 if(i%2==0) {
				 eSum=eSum+rem;
//				 System.out.println(eSum);
			 }else {
				 oSum=oSum+rem;
			 }
			 i++;
			 n=n/10;
			 
		 }
		 System.out.println(eSum);
		 System.out.println(oSum);
		 int sub=eSum-oSum;
		 
		if(sub%11==0||sub==0) {
			return true;
		}
		return false;
		 
	 }

}
