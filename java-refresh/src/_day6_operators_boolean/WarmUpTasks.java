package _day6_operators_boolean;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main (String[]args) {
		
		/*
		
	Scanner calc = new Scanner(System.in);
	
	System.out.println("Enter speed in miles");	
	double miles = calc.nextDouble();
	double km = miles * 1.6;
	
	System.out.println("There is "+km+" km in "
						+miles+" miles");	
	
	calc.close();
	
	*/

	System.out.println("Enter current odometr value");
	
	Scanner scan = new Scanner(System.in);
	double currentValue = scan.nextDouble();
	
	System.out.println("Enter previous odometr value");
	double previousValue = scan.nextDouble();
	
	System.out.println("Enter number of gallons per gallon");
	double gallons = scan.nextDouble();
	
	System.out.println("Enter price per gallon");
	double price = scan.nextDouble();
	
	double mpg = (currentValue-previousValue)/gallons;
	System.out.println("MPG "+mpg);
	
	double totalCost = gallons*price;
	System.out.println("Your total cost is "+ totalCost+"$");

	scan.close();
	}
}	
