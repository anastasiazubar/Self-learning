package day43_constractors02_static;

public class Dinner {
	
	public static int pizzaSlices = 8;
	
	public void takeSlice() {
		pizzaSlices--;
	}
	
	public void takeSlice(int num) {
		pizzaSlices-=num;
	}
	
}
