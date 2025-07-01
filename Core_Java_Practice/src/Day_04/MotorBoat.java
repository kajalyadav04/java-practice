package Day_04;

public class MotorBoat {
	private String motorBoatNumber;
	  private int capacity;
	  
	  public MotorBoat(String motorBoatNumber,int capacity) {
		  this.motorBoatNumber=motorBoatNumber;
		  this.capacity=capacity;
	  }
	  public void setMotorBoatNumber(String motorBoatNumber) {
		  this.motorBoatNumber=motorBoatNumber;
	  }
	  public String getMotorBoatNumber() {
		  return motorBoatNumber;
	  }
	  public void setCapacity(int capacity) {
		  this.capacity=capacity;
		  
	  }
	  public int getCapacity() {
		  return capacity;
	  }

}
