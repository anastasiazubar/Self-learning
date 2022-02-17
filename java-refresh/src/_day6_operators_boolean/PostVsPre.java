package _day6_operators_boolean;

public class PostVsPre {
	public static void main (String[]args) {
		
		int num = 10;
		int num2 = num++;
		System.out.println("num = "+ num);
		System.out.println("num2 = "+ num2);
		
		/////////////////////////
		
		int tom = 5;
		int bag = ++tom;
		
		System.out.println("tom = "+ tom);
		System.out.println("bag = "+ bag);

	}
}
