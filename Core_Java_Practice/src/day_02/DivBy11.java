package day_02;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class DivBy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=11223344;
      divideByEleven(n);

}

	private static void divideByEleven(int n) {
		// TODO Auto-generated method stub
		int i=0;
		int oddsum=0;
		int evenSum=0;
		while(n>0) {
			int rem=n%10;
			if(i%2==0) {
				oddsum=oddsum+rem;
			}
			else {
				evenSum=evenSum+rem;
			}
			i++;
			n=n/10;
			
		}
		int sub=evenSum-oddsum;
		if(sub==0&&sub%11==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}
