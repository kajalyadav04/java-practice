package Day_04;


public class BoatTicketIssue {
	static boolean issueTicket(Passenger passenger, SpeedBoat speedBoat) {
		if(speedBoat.getcapacity()>0) {
			passenger.setSpeedBoat(speedBoat);
			speedBoat.setcapacity(speedBoat.getcapacity()-1);
			return true;
			
			
		}
		return false;
	    //write code to allot speed boat to passenger it has vacant seat
	    //reduce total capacity of the boat by 1 after allocation
	    //if boat allocation it successful then return true; false otherwise
	  }

	static boolean issueTicket(Passenger passenger, MotorBoat motorBoat) {
		if(motorBoat.getCapacity()>0) {
			passenger.setMotorBoat(motorBoat);
			motorBoat.setCapacity(motorBoat.getCapacity()-1);
			return true;
		}
		return false;
	    //write code 
//		to allot motor boat to passenger it has vacant seat
	    //reduce total capacity of the boat by 1 after allocation
	    //if boat allocation it successful then return true; false otherwise
	  }
	}


