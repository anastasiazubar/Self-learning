package _day4_operators;

import java.util.Scanner;

public class SumOfNum {
	public static void main (String[]arg) {
		
		int num1,num2,num3,sumOfNum;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter num 1");
		num1 = scan.nextInt();
		System.out.println("Enter num 2");
		num2 = scan.nextInt();
		System.out.println("Enter num 3");
		num3 = scan.nextInt();
		
		sumOfNum = num1+num2+num3;
		
		System.out.println("Sum of above three numbers will be "
						+ sumOfNum);
		scan.close();
	}
}
