package day40_customclasses;

public class CellphoneFactory {
	public static void main(String[]args) {
		
		//create object from a Cellphone class
		
		Cellphone phone1 = new Cellphone();
		phone1.brand="Apple iPhone XS";
		phone1.color="Piano Black";
		phone1.price=999.20;
		
		phone1.call();
		phone1.text();
		
		//create 2 cellphone
		Cellphone phone2 = new Cellphone();
		Cellphone phone3 = new Cellphone();
		
		phone2.brand="Samsung 10";
		phone2.color="Piano Black";
		phone2.price=1200.20;
		
		
		phone3.brand="HTC";
		phone3.color=" Black";
		phone3.price=200.20;
		
		phone2.call();
		phone3.text();
				
		double total_price = phone1.price+phone2.price+phone3.price;
		System.out.println("Total price for 3 phones = " + total_price );
		
	}
}
