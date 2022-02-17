package day10_ternary_leap_year_FizzBuzz;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of month");
	int month = input.nextInt();

	String season = "Season";
	
	if (month>=0 && month <= 12) {
		
		if(month==12 || month == 1 || month == 2) {
			season = "Winter";
		}
		System.out.println("There is: "+ season );

	}else {
		System.out.println("There is no month like that:)");
	}
		
	input.close();
	}
	
}
