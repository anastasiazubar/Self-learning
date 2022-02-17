package day14_day15_stringmanipulation;

import java.util.Scanner;

public class StatingTheObvious {
	public static void main (String[]args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the email, and we will create yout cybertek email");
			String email_find = scan.next();
			int dat = email_find.indexOf("@");
			String domain = email_find.substring(0, dat);
			System.out.println("Your name "+ domain);
		
		String cybertekplus = "@cybertek.edu";
			System.out.println("Cybertek email is : "+domain.concat(cybertekplus));

		scan.close();
		
		
		
	}
}
