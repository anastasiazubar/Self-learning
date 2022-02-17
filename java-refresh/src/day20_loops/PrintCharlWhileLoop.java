package day20_loops;

import java.util.Scanner;

public class PrintCharlWhileLoop {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word");
		
		String txt = input.next();
		
		int num = 0;
		int lenn = txt.length();
		
		while(num < lenn){
			System.out.println(txt.charAt(num));
			num++;
		}
		
		input.close();
		
	}
}
