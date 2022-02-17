package day40_customclasses;

public class Movie_Class_Use {
	public static void main (String[]args) {
		
		Movie_Class m1 = new Movie_Class();
		Movie_Class m2 = new Movie_Class();
		Movie_Class m3 = new Movie_Class();

		m1.name="Avengers";
		m1.lenth=3 ;
		
		m2.name="Money Heist";
		m2.lenth=30;
				
		m3.name="Starwards";
		m3.lenth=5000;
		
		m1.watch();
		m2.watch();
		m3.watch();
		
		m3.buy(40.20);
		
	}
}
