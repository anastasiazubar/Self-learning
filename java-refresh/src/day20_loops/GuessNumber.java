package day20_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main (String[]args) {
		
		/*
		 * random is a class name
		 */
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int secretNumber = random.nextInt(10);
		int guessNumber;
		int iTries = 0;
		
		do {
			System.out.println("Guess number from 1 to 10");
			guessNumber = input.nextInt();
			
			iTries++;

			if(secretNumber==guessNumber) {
				System.out.println("Yayyy you are win");
				break;
			}else if (secretNumber > guessNumber) {
				System.out.println("Too small");
			}else {
				System.out.println("Too large");
			}
			
			if(iTries==5) {
				System.out.println("You are lost");
				System.out.println("Secret number was "+ secretNumber );
				break;
			}
			
		}while(secretNumber !=guessNumber && iTries<=5 );

		
		input.close();
		
	}
}
