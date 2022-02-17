package _day4_operators;

public class BasicMathOperators {
	public static void main(String [] args) {
		int num1 = 100;
		int num2 = 200;
		
		System.out.println(num1+num2); //300
		System.out.println(num1+num2+1200); //1500
		
		System.out.println("==========================================="); //1500

		//TASK
	
		double apples, carrots, tomatos;
		double tax,totalBeforeTax, totalAfterTax;
		
		apples = 13.55;
		carrots = 1.20;
		tomatos = 5.25;
		tax = 0.06;
		
		totalBeforeTax = apples+carrots+tomatos;
		System.out.println("Total before taxes " +totalBeforeTax);
		
		totalAfterTax = totalBeforeTax+(totalBeforeTax*tax);
		System.out.println("Total after taxes "+totalAfterTax);

		
	}
}
