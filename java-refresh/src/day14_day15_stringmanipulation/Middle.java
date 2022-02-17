package day14_day15_stringmanipulation;

import java.util.Scanner;

public class Middle {
	public static void main(String[]args) {
		
		Scanner check = new Scanner(System.in);
		System.out.println("Please enter a world");
		String world = check.next();
		
		boolean isOdd = world.length()%2 == 1;		
		boolean moreThen3 = world.length()>=3; //should be more then 3 
		
		if (isOdd && moreThen3) {
			System.out.println("isOdd: "+isOdd);
			System.out.println("there more then 3 character: "+moreThen3);
			
			int lenn = world.length();
			int mid = lenn/2;
			System.out.println("Mid character : "+ world.charAt(mid));
			
		}else if(isOdd || moreThen3) {
			System.out.println("World should be odd and more than 3 characters");
		}else {
			System.out.println("Entered world not odd and less then 3 characters");
		}


		check.close();
	}
}
