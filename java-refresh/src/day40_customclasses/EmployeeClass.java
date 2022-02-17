package day40_customclasses;

public class EmployeeClass {
	String firstName, lastName, email, jobTitle;
	double hourlySalary;
	
	public void work() {
		System.out.println(firstName+" "+lastName+" is working as "+jobTitle);
	}
	
	public static void main (String[]args) {
		EmployeeClass emp1 = new EmployeeClass();
		emp1.firstName = "Anastasiia";
		emp1.lastName = "Zubar";
		emp1.email = emp1.firstName+emp1.lastName+"@gmail.com";
		emp1.jobTitle = "Test Lead";
		emp1.hourlySalary = 65.50;
		
		System.out.println("First Name: "+emp1.firstName);
		System.out.println("Last Name: "+emp1.lastName);
		System.out.println("Job Title: "+emp1.jobTitle);
		System.out.println(emp1.firstName + " is making "+emp1.hourlySalary+" per hour");



	}
}
