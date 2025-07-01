package Day_04;

public class ZiaConstructionsLimited {
	double getTotalCost(double totalArea,double labourCharges) {
		return labourCharges*totalArea;
		
	}
	double getTotalCost(double totalArea, double labourCharges, double materialCharges) {
		return(labourCharges+materialCharges)*totalArea;
	}

}
