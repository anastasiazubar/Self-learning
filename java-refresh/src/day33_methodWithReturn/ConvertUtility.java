package day33_methodWithReturn;

import day31_methods.Calculator;

public class ConvertUtility {
	public static void main (String[]args) {
		System.out.println(faranheitToCelvius(72));
		System.out.println(milesToKilometrs(72));
		milesToKilometrsV2(72);
	}
	
	public static double milesToKilometrs (double ml) {
		double km = ml*1.6;
		return km;
	}
	
	public static double milesToKilometrsV2 (double ml) {
		return Calculator.Multiply(ml, 1.60934);
	}
	
	public static int faranheitToCelvius(int Faranheit){
		
		int Celcius = (Faranheit - 32) * 5/9;
		return Celcius;
		
	}
}
