package day32_methodsWithReturnValue;

import java.util.*;

public class GuesseNumber {
	public static void main (String[]args) {
		playGuessNumComputerOnly();
		System.out.println("-------------------------------------");
		playGuessNumWithLimit(6);
	}
	
	/*
	 * Methods
	 */
	
	// computer guessing number
	public static void playGuessNumComputerOnly() {
		Random random = new Random();
		int secretNum = random.nextInt(21);
		int guessNumber;
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess secret number");
			guessNumber = random.nextInt(21);
			System.out.println("Guessing: "+ guessNumber);
				if(guessNumber==secretNum) {
					System.out.println("You won!It takes you "+counter+" times to guess");
					break;
				}else {
					System.out.println("Try again!");
				}
		}while(true); 
	}
	
	//limit times
	public static void playGuessNumWithLimit(int limit) {
		Random random = new Random();
		int secretNum = random.nextInt(21);
		int guessNumber;
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess secret number");
			guessNumber = random.nextInt(21);
			System.out.println("Guessing: "+ guessNumber);
				if(guessNumber==secretNum) {
					System.out.println("You won!It takes you "+counter+" times to guess");
					break;
				}else {
					System.out.println("Try again!");
				}
				
				if(counter == limit) {
					System.out.println("You lost");
					break;
				}
		}while(true);
	}
	
}
