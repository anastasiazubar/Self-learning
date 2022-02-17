package day11_switchCase;

import java.util.Scanner;

public class Calculator {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double num1,num2,result;
		char operator;
		
		System.out.println("Please enter num1");
		num1 = input.nextDouble();
		System.out.println("Please enter num2");
		num2 = input.nextDouble();
		System.out.println("Please enter operator");
		operator = input.next().charAt(0);
	input.close();

		switch(operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '*':
			result = num1*num2;
			break;
		default:
			System.out.println("Operation not reflected");
			return;  //don't run the code below
		}
	System.out.println(result);
	}
	
}
