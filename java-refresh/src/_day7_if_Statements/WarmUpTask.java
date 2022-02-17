package _day7_if_Statements;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[]args) {
		
		Scanner convert = new Scanner(System.in);
		
		System.out.println("Please enter correct amout USD");
		
		double USD = convert.nextDouble();
		
		double usdToeur_exchangeIndacator = 0.859594;
		double eurdTousd_exchangeIndacator = 1.1633399;
		
		double EUR = USD*usdToeur_exchangeIndacator;
		double USDfromEur = USD*eurdTousd_exchangeIndacator;
		
		System.out.println("EUR "+EUR);
		System.out.println("USD "+USDfromEur);

		convert.close();
		
		}
	
}
