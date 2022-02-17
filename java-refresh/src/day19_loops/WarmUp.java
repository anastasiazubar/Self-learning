package day19_loops;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[]args) {
		
		//1 Task
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a world");
		String txt = input.next();
		System.out.println(txt.substring(0,1).toUpperCase().concat(txt.substring(1).toLowerCase()));
		
		input.close();
		
		//2 Task
		
		int num = 1;
		while(num<=10) {
			System.out.print(num+" ");
			++num;
		}
		System.out.println("Your last number "+num);

		
		//3
		int n = 10;
		while(n >= 0) {
			System.out.print(n +" ");
			--n;
		}
		System.out.println("Your last number "+n);
	}
}
