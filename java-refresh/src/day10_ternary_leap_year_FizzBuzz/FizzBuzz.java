package day10_ternary_leap_year_FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
	public static void main (String[]args) {
		
		Scanner num_input = new Scanner(System.in);
		
		System.out.println("Please select a number");
		
		int num = num_input.nextInt();
		
		if(num%3 == 0 && num%5 == 0) {
			System.out.println("This is FUZZBUZZ");
		}else if(num%3 == 0) {
			System.out.println("This is FUZZ");
		}else if (num%5 == 0) {
			System.out.println("This is BUZZ");
		}else {
			System.out.println("This is nothing though");
		}
		
		num_input.close();
	}
}
