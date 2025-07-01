package Day_04;

public class Employee {
	String empId;
	String empName;
	double salary;

	Address address = new Address();

	public void showDetails(){
		
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+salary);

		System.out.println("Employee Address :");
		address.printAddress();
	

}
	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.showDetails();
		
		Employee emp2=new Employee();
		emp2.empId = "Emp-01";
		emp2.empName = "Ramesh";
		emp2.salary = 50000;

		emp2.address.city = "Coimbator";
	  emp2.address.state = "Tamilnadu";
		emp2.address.pincode = "434322";
		
		emp2.showDetails();
		
	}
}
