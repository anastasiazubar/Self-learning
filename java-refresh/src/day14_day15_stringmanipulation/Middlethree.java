package day14_day15_stringmanipulation;

import java.util.Scanner;

public class Middlethree {
	public static void main (String[]args) {
		
		Scanner check = new Scanner(System.in);
		System.out.println("Please enter a world");
		String world = check.next();
		
		boolean isOdd = world.length()%2 == 1;		
		boolean moreThen5 = world.length()>=5; //should be more then 5 
		
		if (isOdd && moreThen5) {
			System.out.println("isOdd: "+isOdd);
			System.out.println("there more then 3 character: "+moreThen5);
			
			int lenn = world.length();
			int mid = lenn/2;
			System.out.println("Mid character : "+ world.substring(mid-1,mid+2));
			
		}else if(isOdd || moreThen5) {
			System.out.println("World should be odd and more than 3 characters");
		}else {
			System.out.println("Entered world not odd and less then 3 characters");
		}


		check.close();
	}
}
