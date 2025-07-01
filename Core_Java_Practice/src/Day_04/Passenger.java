package Day_04;

public class Passenger {
	private String passengerId;
	  private String name;
	  private SpeedBoat speedBoat;
	  private MotorBoat motorBoat;
	  private static int passengerCounter;

	  public Passenger(String name) {
	    //code to generate passenger is PS001 and onwards...
	    //use passengerCounter for the same
	    //write code to set name
		  this.name=name;
		  passengerCounter++;
		  this.passengerId="PS"+passengerCounter;
	  }
	  public String getPassengerId() {
		  return passengerId;
	  }
	  public void setName(String name) {
		  this.name=name;
	  }
	  public String getName() {
		  return name;
	  }
	  public SpeedBoat getSpeedBoat() {
		  return speedBoat;
	  }
	  public void setSpeedBoat(SpeedBoat speedBoat) {
		  this.speedBoat = speedBoat;
	  }
	  public void setMotorBoat(MotorBoat motorBoat) {
		  this.motorBoat=motorBoat;
		
	}
	  public MotorBoat getMotorBoat() {
		  return motorBoat ;
		
	}
	  

}
