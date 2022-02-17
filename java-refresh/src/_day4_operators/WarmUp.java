package _day4_operators;

public class WarmUp {

	public static void main(String[] args) {
		//Pancakes: eggs - 1,flour - 1 cup, milk - 0.5 cup
		//sugar - 2 spoons, oil - 2 table spoons
		
		int eggs = 2;
		int cupOfFlour = 1;
		double cupOfMilk = 0.5;
		byte spoonsOfSugar  = 2;
		short oil = 2; 
		
		System.out.println("You need "+eggs+" eggs");
		System.out.println("and  "+cupOfFlour+" cup of flour");
		System.out.println("and "+cupOfMilk+" cup of milk");
		System.out.println("and  "+spoonsOfSugar+" spoons of sugar");
		System.out.println ("and "+oil+" oil");
		
		//Print everything in one line 
		
		System.out.println("You need "+eggs+" eggs"+
						" and  "+cupOfFlour+" cup of flour"+
						" and "+cupOfMilk+" cup of milk" + 
						" and  "+spoonsOfSugar+" spoons of sugar"+
						" and "+oil+" oil");

	}

}
