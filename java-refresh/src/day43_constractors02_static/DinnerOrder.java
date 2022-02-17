package day43_constractors02_static;

public class DinnerOrder {
	public static void main (String[]args) {
		
		Dinner dad = new Dinner();
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();

		System.out.println("Pizza sclices: "+Dinner.pizzaSlices);
		
		dad.takeSlice(3);
		kid.takeSlice(2);
		mom.takeSlice();
		
		System.out.println("Pizza sclices: "+Dinner.pizzaSlices);

	}
}
