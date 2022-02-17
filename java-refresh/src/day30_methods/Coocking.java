package day30_methods;

public class Coocking {
	public static void main (String[]args) {
		
		Coock("Pizza");
		Products("tomato,cheese,meat");
		coockFor(50,"baking");
		ready();
	}
	
	public static void Coock(String foodName) {
		System.out.println("Today we will coock "+foodName);
	}
	public static void Products(String products) {
		System.out.println("You will need: "+products);
	}
	public static void coockFor(int min,String wayOfCoocking) {
		System.out.println("You will need "+min+" min for "+wayOfCoocking);
	}
	public static void ready() {
		System.out.println("Enjoy");
	}
}
