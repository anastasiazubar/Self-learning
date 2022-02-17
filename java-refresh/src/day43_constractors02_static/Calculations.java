package day43_constractors02_static;

public class Calculations {

	public static void main (String[]args) {
		
		double num1 = Calculator.add(30, 3);
		System.out.println(num1);
		
		double num2 = Calculator.minus(50, 3);
		System.out.println(num2);
		
		Calculator newCalc = new Calculator();
		double num3 = newCalc.multiply(30, 23);
		System.out.println(num3);
		
		double num4 = newCalc.add(23, 34);
		System.out.println(num4);

		// Calculator.operation = "add"				not working,because 'operation' not static
		
		
		
	}
}
