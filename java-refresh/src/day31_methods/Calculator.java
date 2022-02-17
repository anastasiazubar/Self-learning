package day31_methods;

import java.util.*;

public class Calculator {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		Add(num1,num2);
		Substract(num1,num2);
		Multiply(num1,num2);
		
		/*
		 * Switch
		 */
		
		System.out.println("Enter num of operation");
		int operation = input.nextInt();
		switch(operation) {
			case 1: 
				Add(num1,num2);
				break;
			case 2:
				Substract(num1,num2);
				break;
			case 3:
				Multiply(num1,num2);
				break;	
		}
		
		input.close();
	}
	
	public static void Add(double num1, double num2) {
		double result = num1+num2;
		System.out.println(result);
	}
	public static void Substract(double num1, double num2) {
		double result = num1-num2;
		System.out.println(result);
	}
	public static double Multiply(double num1, double num2) {
		double result = num1*num2;
		System.out.println(result);
		return result;
	}
	
}
