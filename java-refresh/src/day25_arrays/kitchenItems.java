package day25_arrays;

public class kitchenItems {
	public static void main (String[]args) {
		
	String[]kitchenItems = {"spoons","knife","plates","cups","forks","trash can","fridge"};
	
	for(String item:kitchenItems ) {
		switch(item) {
		case"knife":
			System.out.println("Knife is used for cutting veggies");
			break;
		case"spoons":
			System.out.println("Spoons is used for eating soops");
			break;
		case"plates":
			System.out.println("Plates is used for serving foods");
			break;	
		case"cups":
			System.out.println("Cups is used for drinking");
			break;	
		case"trash can":
			System.out.println("trash can is used for trash");
			break;	
		case"fridge":
			System.out.println("fridge can is used for keeping food");
			break;
		}
	}
	
		
	}	
}
