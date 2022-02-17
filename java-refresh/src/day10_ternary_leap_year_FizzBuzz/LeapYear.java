package day10_ternary_leap_year_FizzBuzz;

import java.util.Scanner;

public class LeapYear {

	public static void main (String[]args) {
		
		Scanner year_input = new Scanner(System.in);
	
	System.out.println("Please enter a year");
	int year = year_input.nextInt();
	boolean LeapYear = true;
	
	if(year%400==0) {
		LeapYear = true;
		System.out.println(LeapYear+" this is leap Year");
	}else if (year%4 == 0 && year%100 !=0) {
		LeapYear = true;
		System.out.println(LeapYear+" this is leap Year");
	}else {
		LeapYear = false;
		System.out.println("This is not a leap year");

	}
	year_input.close();
	}

}
