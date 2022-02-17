package day13_stringmanipulation;

import java.util.Scanner;

public class WarmUp {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		String word3 = scan.next();

		if(word1.length() == word2.length() && word2.length()== word3.length()) {
			System.out.println("All same lenth");
		}else if(word1.length() == word2.length() ||
				word2.length() == word3.length() || 
				word1.length() == word3.length()) {
			System.out.println("Not same nor different lenth");
		}else {
			System.out.println("They all defferent");
		}

		scan.close();
		
	}
}
