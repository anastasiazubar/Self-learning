package day20_loops;

import java.util.Scanner;

public class ReverseString {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word to check if its palindrome");
		
		String txt = input.next();
		String reversed = "";
		
		for (int i = txt.length()-1;i>=0;i--) {
			reversed+=txt.charAt(i);
		}

		if(reversed.toLowerCase().equalsIgnoreCase(txt)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
			
		input.close();
	}
	
}
