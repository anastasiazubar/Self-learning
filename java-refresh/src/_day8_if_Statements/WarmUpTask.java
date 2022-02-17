package _day8_if_Statements;

import java.util.Scanner;

public class WarmUpTask {
public static void main(String[]args) {
	
	int bage = 10;
	
	if (bage==10) {
		System.out.println("You are classmates");
	}else {
		System.out.println("You are from different bage");
	}	
System.out.println("=============================");
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter a password");

	int currentpassword = input.nextInt();
	int expectedpassword = 777;
	
	if (currentpassword==expectedpassword) {
		System.out.println("You have correct password");
	}else {
		System.out.println("Password declined. Try again");
	}
System.out.println("=============================");

	
	
	System.out.println("Please enter a number");
	
	int num1 = input.nextInt();
	int evenNum = num1%2;
	
	if (evenNum==0) {
		System.out.println("This number is even, because remainder = 0" );
	}else {
		System.out.println("This number is odd, because remainder != 0");
	}
	
input.close();
}
}
