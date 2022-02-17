package _day5_operators;

import java.util.Scanner;

public class MoneyTransfer {
	public static void main(String[] args) {
	/*
		int pennies = 250;
		int dollars = pennies/100;
		System.out.println(dollars);
		
		pennies %=100; //50
		System.out.println(pennies);
	*/
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter count of pennies you have"); 
	
	int pennies = keyboard.nextInt();
	int dollars, quaters, dimes, nickels, cents;
	
	dollars = pennies/100; 
	pennies %=100;
	
	quaters = pennies/25;
	pennies %=25;
	
	dimes = pennies/5;
	dimes %=5;
	
	nickels = pennies/5;
	nickels %=5;
	
	cents = pennies;
	
	System.out.println("Dollars "+dollars);
	System.out.println("Quaters "+quaters);
	System.out.println("dimes "+dimes);
	System.out.println("nickels "+nickels);
	System.out.println("cents "+cents);
	
	keyboard.close();
	
	}
	
}
