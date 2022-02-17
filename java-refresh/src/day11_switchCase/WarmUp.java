package day11_switchCase;

import java.util.Scanner;

public class WarmUp {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);

		int floor = input.nextInt();
		
		switch(floor) {
	case 1:
		System.out.println("Lobby");
		break;
	case 2:
		System.out.println("Google");
		break;
	case 3:
		System.out.println("Cybertek");
		break;
	case 4:
		System.out.println("Apple");
		break;
	default:
		System.out.println("No such floor");
	}
	input.close();

	}
	
	
	
}
