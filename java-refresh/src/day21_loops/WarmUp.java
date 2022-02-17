package day21_loops;

import java.util.Scanner;

public class WarmUp {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text");
		String txt = input.next();
		
		System.out.println("Enter looking character");
		char chr = input.next().charAt(0);
		int count = 0;
		
		for(int i=0; i<txt.length();i++) {
			if(txt.charAt(i)==chr) {
				count++;
			}
			
		}
		System.out.println("Looking currecter is repeats: " + count);
		
		input.close();
		
	}
}
