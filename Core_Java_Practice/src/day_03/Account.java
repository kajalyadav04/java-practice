package day_03;

public class Account {
	static String bankName;
	long accountNumber;
	String accountHolderName;
	double balance;
	
	public static void main(String[] args) {
		Account.bankName="SBI";
		Account a1=new Account();
		a1.accountHolderName="k";
		a1.accountNumber=1;
		a1.balance=100;
		
		Account a2=new Account();
		a2.accountHolderName="a";
		a2.accountNumber=2;
		a2.balance=120;
		System.out.println("a1 details:");
		System.out.println(a1.accountHolderName);
		System.out.println(a1.accountNumber);
		System.out.println(a1.accountNumber);
		
		
	}
	

}
