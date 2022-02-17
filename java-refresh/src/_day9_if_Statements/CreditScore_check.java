package _day9_if_Statements;

import java.util.Scanner;

public class CreditScore_check {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int percentage = 0;
		String CreditStatus;
		
		System.out.println("Please enter credit scrore");
	
		int screditscore = scan.nextInt();
		
		if (screditscore<0 || screditscore>850) {
			CreditStatus = "Invalid credit score. Can not be nagative or more than 850";
		}else if (screditscore>=300 && screditscore<=579) {
			CreditStatus = "Your credit score is very poor";
			percentage = 16;
		}else if (screditscore>579 && screditscore<=669) {
			CreditStatus = "Your credit score is fair";
			percentage = 18;
		}else if (screditscore>669 && screditscore<=739) {
			CreditStatus = "Your credit score is fair";
			percentage = 21;
		}else if (screditscore>740 && screditscore<=799) {
			CreditStatus = "Your credit score is very good :)";
			percentage = 25;
		}else if (screditscore>799 && screditscore<=850) {
			CreditStatus = "Your credit score is EXEPTIONAL WOOOOW :)";
			percentage = 20;
		}else {
			CreditStatus = "Looks like you don't have it yet";
		}
		
		System.out.println(CreditStatus);
		System.out.println("You are one of "+ percentage +" % of people");

		scan.close();
	}

	
}
