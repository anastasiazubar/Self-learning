package _day4_operators;

import java.util.Scanner;

public class AgeCalculatorWithScanner {
	public static void main (String[]agr) {
		Scanner scan = new Scanner (System.in);
		
		int yearofBirth,currentYear,age;
		
		System.out.println("Enter year of birth");
		yearofBirth = scan.nextInt();
		
		System.out.println("Enter current year");
		currentYear = scan.nextInt();
		
		age = currentYear-yearofBirth;

		System.out.println ("If you are born on "+yearofBirth+
				" year, then you are "+age);	
		
		scan.close();		
	}
}
