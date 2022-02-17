package day10_ternary_leap_year_FizzBuzz;

import java.util.Scanner;

public class PriceCheck {
	public static void main (String[]args) {
		
		Scanner item_input = new Scanner (System.in);
		
		System.out.println("Please enter amount of items");
		
		int item = item_input.nextInt();
		String status;
		
		status = (item>1 && item<50) ? "Cheap":
			(item>51 && item<100) ? "Expensive":"Not Buying";
		
		System.out.println(status);
			
		item_input.close();
	}
}
