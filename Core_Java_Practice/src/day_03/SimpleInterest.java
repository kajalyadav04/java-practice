package day_03;

public class SimpleInterest {
	double pa; 
	double tp;
	double ir;
	double value;

	
		// TODO Auto-generated method stub
		
			void setValues(double pa, double tp, double ir)
			{
			    //write code to assign a value here
				this.pa=pa;
				this.tp=tp;
				this.ir=ir;
				
				
			}

			double getInterestAmount(){
			    //write code to computer and return the interest amount rounded to two decimal places
				value=pa*tp*ir/100;
				value=(Math.round(value*100))/100.0;
				return value;
			}

			//Use the following code to round up to two decimal places (Math.round(value * 100))/100.0
			//Tip: Say the interest amount is 253.2659874 then (Math.round(253.2659874 * 100))/100.0 so it should return 253.27


}
