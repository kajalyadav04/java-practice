package day_03;

public class WatchPriceCalculator {
	
	
	double getWatchPrice(String watchType, int age, String gender){
		int cp=0;
		double percentage=0.0;
		double gst=0.0;
		double sp=0.0;
		
		//code to computer and return the price of watch up to two decimal
        if(watchType.equals("Titan") ){
        	cp = 7999;
        	percentage = 12.5;
        	gst = 7.5;
        	sp= cp+(percentage/100)*cp+(gst/100)*(cp+(percentage/100)*cp);
//     	System.out.println("t"+sp);			
        }
        else if(watchType.equals("Rolex")){
        	cp = 10999;
        	percentage = 13.5;
        	gst = 12.5;
        	sp= (cp+(percentage/100)*cp)+(gst/100)*(cp+(percentage/100)*cp);
        	System.out.println("r"+sp);
        }
       
        
        if((age>=60)) {
        	sp=sp-((3.0/100)*sp);
        	
        }
        else if(gender.equals("female")) {
        	sp=sp-((2.0/100)*sp);
        }
        
        return sp=(Math.round(sp*100))/100.0;
        
		
		}
		}


