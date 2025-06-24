package day_03;

import java.util.Scanner;

public class watchPrice {
	String watchType;
	int age; 
	String gender;
	
	
	double calc(String watchType, int age, String gender) {
		double cp=0;
		double pp=0;
		double gst=0.0;
		
		if(watchType.equalsIgnoreCase("Titan")) {
			cp=7999;
			pp=12.5;
			gst=7.5;
			
			
			
		}
		else if(watchType.equalsIgnoreCase("Rolex")) {
			cp=10999;
			pp=13.5;
			gst=12.5;
			
		}
		double profit=(cp*pp)/100;
		double amount=cp+profit;
		amount=amount+(amount*gst)/100;
		if(gender.equalsIgnoreCase("female")) {
			amount=amount-(amount*2)/100;
		}
		if(age>60) {
			amount=amount-(amount*3)/100;
		}
		
		
		
		return Math.round(amount*100)/100.0;
		
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter watchtype:");
		String watchType=sc.next();
		System.out.println("gender:");
		String gender = sc.next();
		System.out.println("age:");
		int age=sc.nextInt();
		watchPrice w1= new watchPrice();
		double k=w1.calc(watchType,  age,gender);
		System.out.println(k);
		
		
	}

}
