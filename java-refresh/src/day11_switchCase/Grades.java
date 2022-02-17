package day11_switchCase;

import java.util.Scanner;

public class Grades {
	public static void main (String[]args) {
		/*
 * A -> Excellent
 * B -> Good
 * C -> Acceptable
 * D -> Poor
 */
		
		Scanner grade_input = new Scanner(System.in);
		
		System.out.println("Please enter a grade");
		
		char grade = grade_input.next().charAt(0);
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Acceptable");
			break;
		case 'D':
			System.out.println("Poor");
			break;		
		default:
			System.out.println("No such grade");
			// break is optional for default 

		}	
		grade_input.close();
	}

	
	
}
