package day10_ternary_leap_year_FizzBuzz;

public class TernaryOperator {
	public static void main (String[]args) {
		
		int score = 70;
		String status;
		
		status = (score>60)? "pass":"fail";
		
		System.out.println("Status: "+ status);		//same as if statement 
	/*
	 * 
	 * 
	 * 
	 */
	
	boolean express = true;
	String shipping;
	
	System.out.println("express"+ express + " or free ");	

	shipping = (express = true)? "25$":"15$";
	
	System.out.println("Shipping: "+ shipping);		//same as if statement 

	
	
	}
}
