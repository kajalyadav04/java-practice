package day_02;

import java.util.Scanner;

public class DivisibleByEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int evenSum=0;
  int oddSum=0;
  int resultant=0;
  
  int i=0;
  while(n>0) {
	  n=n%10;
	  n=n/10;
	  if(i%2==0) {
		  evenSum+=evenSum+n;
	  }
	  else {
		  oddSum+=oddSum+n;
	  }
  }
  
  resultant=oddSum-evenSum;
  if(resultant%11==0||resultant==0)
  {
	  System.out.println("y");
  }
  else {
	  System.out.println("n");
  }
}
}
