package Day_04;

public class SpeedBoat {
	private String speedBoatNumber;
	  private int capacity;
	  public SpeedBoat(String speedBoatNumber,int capacity) {
		  this.speedBoatNumber=speedBoatNumber;
		  this.capacity=capacity;
	  }
	  public void setspeedBoatNumber(String speedBoatNumber){
		  this.speedBoatNumber=speedBoatNumber;
	  }
	  public String getspeedBoatNumber() {
		  return speedBoatNumber;
	  }
	  public void setcapacity(int capacity) {
		  this.capacity=capacity;
	  }
	  public int getcapacity() {
		  return capacity;
	  }
}
