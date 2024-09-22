import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	int sum=0;
		System.out.println("enter number num:");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		sumOfdigits(num);
       
	}
	public  static void sumOfdigits(int num ) {
		int sum=0;
		while(num>0) {
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
		}
		System.out.println(sum);
	}

}
