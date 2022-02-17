package day16_day17_reviewSession;

import java.util.Scanner;

public class String003 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter country name");
		
		String country = input.next();
		String abbreviated = country.substring(0,2).toUpperCase();
		
		System.out.println("Abbreviated of country "+country+" is: "+abbreviated);

		input.close();
	}

}
