package day19_loops;

import java.util.Scanner;

public class Giveme5dollars {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		int total;	

		
		do{
		System.out.println("Give me 5 dollars");
		 total = input.nextInt();
		}while(total!=5);
		System.out.println("Thanks maaan");
			
		input.close();	
		
		
	}
}
