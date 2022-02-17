package day14_day15_stringmanipulation;

import java.util.Scanner;

public class lastFirstChar {
	public static void main (String[]args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter first world");
		String n1 = input.next();
		
		System.out.println("Please enter first world");
		String n2 = input.next();
		
		int lenth = n1.length();
		char LastChar = n1.charAt(lenth-1);
		System.out.println ("Last char of first world is: "+LastChar);
		char FirstChar = n2.charAt(0);
		System.out.println ("First char of second world is: "+FirstChar);

		
		if(LastChar == FirstChar ) {
			System.out.println ("Last char of first world same as first char of second world");
			System.out.println (n1.concat(n2.substring(1)));
		}else {
			System.out.println ("Last char of first world NOT same as first char of second world");
			System.out.println (n1.concat(n2));
			
			input.close();
		}
		
		
		
	}
}
