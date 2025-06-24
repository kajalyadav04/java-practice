package day_03;

public class JoyInfocom {
	int callService=300;
	int smsserive=125;
	int dataService=50;
	int sum=0;
	int getBillAmount(boolean usingCallService, boolean
			usingSMSService, boolean UsingDataService){
		if(usingCallService) {
			sum=callService;
			if(usingSMSService) {
				sum+=smsserive;
				if(UsingDataService) {
					sum+=dataService;
				}
				
			}
		}
		
				return sum;
			//write code to return bill amount up to two decimal places
			}
			}
			


