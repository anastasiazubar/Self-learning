package day13_stringmanipulation;

import java.util.Scanner;

public class Login {
	public static void main (String[]args) {
		
		String secretUserName = "Admin";
		String secretPwd = "admin_pwd";
				
		Scanner credentials = new Scanner(System.in);
		
		System.out.println("Please enter a username");
		String userName = credentials.next();
		System.out.println("Please enter a password");
		String userPdw = credentials.next();
		
		if (secretUserName.equalsIgnoreCase(userName) && secretPwd.equals(userPdw) ) {
			System.out.println("Yeey");
		}else {
			System.out.println("Please neter correct password and username");
		}
			credentials.close();
	}
}
