package day22_nested_loops;

import java.util.Scanner;

public class Register {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("----Welcome to our strore------:)");
		System.out.println("How many item do you have");
		
		int itemCount = input.nextInt();
		String allItems="";
		double totalPrice = 0;
		
		
		for(int i=1;i<=itemCount;i++) {
			System.out.println("What is item "+i+"?");
			String item = input.next();
			
			System.out.println("How much is "+item+" ?");
			double price = input.nextDouble();
			
			if (i==itemCount) {
				allItems+= item;
				totalPrice +=price;	
			}else {
				allItems+= item+",";
				totalPrice +=price;	
			}
		}
			
	

		System.out.println("All items "+allItems);
		System.out.println("Total price $"+totalPrice);

		input.close();
	}
}
