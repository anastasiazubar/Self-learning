package _day5_operators;

public class OperatorsPractice {

	public static void main(String[] args) {
		//1
		 int apples = 5; 
		 apples+=10;
		System.out.println (apples);
		
		//2
		int carsInlot = 23;
		carsInlot -= 10;
		System.out.println(carsInlot);
		
		//3 
		int pizzaSlices = 12;
		int people = 5;
		int pizzaToPeople = pizzaSlices / people;
		System.out.println(pizzaToPeople);
		
		//4
		int min = 100;
		int hours = min/60;
		System.out.println("Hours: "+hours);

		min %= 60;;
		System.out.println("Min: " + min);
	
	}

}
