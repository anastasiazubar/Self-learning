package day40_customclasses;

public class Company {
	public static void main (String[]args) {
		
		EmployeeClass emp1 = new EmployeeClass();
		EmployeeClass emp2 = new EmployeeClass();

		emp1.firstName = "Anastasiia";
		emp1.lastName = "Zubar";
		emp1.email = emp1.firstName+emp1.lastName+"@gmail.com";
		emp1.jobTitle = "Test Lead";
		emp1.hourlySalary = 65.50;
		
		emp2.firstName = "Roman";
		emp2.lastName = "Pereverziev";
		emp2.email = emp1.firstName+emp1.lastName+"@gmail.com";
		emp2.jobTitle = "DevOps Lead";
		emp2.hourlySalary = 115.50;
		
		
		System.out.println("First Name: "+emp1.firstName);
		System.out.println("Last Name: "+emp1.lastName);
		System.out.println("Job Title: "+emp1.jobTitle);
		System.out.println(emp1.firstName + " is making "+emp1.hourlySalary+" per hour");

		System.out.println("-----------------------------------------------------------");

		
		System.out.println("First Name: "+emp2.firstName);
		System.out.println("Last Name: "+emp2.lastName);
		System.out.println("Job Title: "+emp2.jobTitle);
		System.out.println(emp1.firstName + " is making "+emp2.hourlySalary+" per hour");
		
		System.out.println("-----------------------------------------------------------");
		
		emp1.work();
		emp2.work();

	}
}
