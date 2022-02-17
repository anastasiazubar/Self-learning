package _day9_if_Statements;

import java.util.Scanner;

public class WarmUp {
	public static void main (String[]args) {
		
		Scanner numcheck = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1 = numcheck.nextInt();
		System.out.println("Enter num2: ");
		int num2 = numcheck.nextInt();
		
		if(num1>num2) {
			System.out.println("MAX num1: "+num1);
		}else if (num2>num1){
			System.out.println("MAX num2: "+num2);
		}else {
			System.out.println("Numbers are equal: " + 
								num1+"="+num2);
		}
	
		numcheck.close();
		
	}
}

