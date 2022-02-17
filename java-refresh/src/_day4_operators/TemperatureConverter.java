package _day4_operators;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main (String[]arg) {
		Scanner scan = new Scanner(System.in);
		
		double f,c;
		
		System.out.println("Enter temperarute in f ");
		f = scan.nextDouble();
		
		c = (5.0/9)*(f-32);
		System.out.println("Temperature in c are "+(int)c);
	
		scan.close();
	};
	
}
