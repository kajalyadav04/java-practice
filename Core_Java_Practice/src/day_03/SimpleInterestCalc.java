package day_03;



public class SimpleInterestCalc {
	private double pa;
	private double tp;
	private double ir;
	
	void setValues(double pa,double tp, double ir) {
		this.pa=pa;
		this.tp=tp;
		this.ir=ir;
		
	}
	double getInterestAmount() {
		double si=(pa*tp*ir)/100;
		return Math.round(si * 100)/100.0;
		
	}
	public static void main(String args[] ) {
		SimpleInterestCalc si1= new SimpleInterestCalc();
		SimpleInterestCalc si2= new SimpleInterestCalc();
		si1.setValues(1235.50, 2.5, 8.25);
		si2.setValues(1005, 2, 7.5);
		System.out.println(si1.getInterestAmount());
		System.out.println(si2.getInterestAmount());
		
	}

}
