package _day4_operators;

public class AgeCalculator {
	public static void main (String[] args) {
		int currentYear, yearofBirth, age;
		
		yearofBirth = 1990;
		currentYear = 2019;
		age = currentYear-yearofBirth;
		
		System.out.println ("If you are born on "+yearofBirth+
							" year, then you are "+age);	
	}
}
