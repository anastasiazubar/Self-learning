package day16_day17_reviewSession;

import java.util.Scanner;

public class Ternary {
	public static void main (String[]args) {
		
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter country name");
	
	String country = input.next();
	String abbreviated = country.substring(0,2).toUpperCase();
	
	System.out.println("Abbreviated of country "+country+" is: "+abbreviated);

	System.out.println(abbreviated.length()==2?"2 chars detected":"2 chars not detected");
	
	//or 	
	System.out.println("OR");

	
	String msg1 = "2 chars detected";
	String msg2 = "2 chars not detected";
	String result = abbreviated.length()==2? msg1 :msg2;
	System.out.println(result);
	
	System.out.println(abbreviated.length()==2? (country.charAt(0)=='U'? "Maybe USA":"Not USA for sure") :"2 chars not detected");

	

	input.close();
	}
	
	
}
