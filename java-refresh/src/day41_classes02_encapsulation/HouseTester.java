package day41_classes02_encapsulation;

public class HouseTester {
	public static void main (String[]args) {
		
		//Step 1 -> Create House Object
		House myHouse = new House();
		House myHouse2 = new House();

		myHouse.type="House";
		myHouse.address = "777 Lucky Rd";
		myHouse.bedroom = 7;
		myHouse.year = 2019;
		
		myHouse2.type="PentHouse";
		myHouse2.address = "1717 Anastasiia Blvd";
		myHouse2.bedroom = 2;
		myHouse2.year = 2019;
		
		//Step2 -> Pass your house object to printHouseInfo method 
		printHouseInfo(myHouse);
		System.out.println("-----------------------------------------------------------");
		
		printHouseInfo(myHouse2);
		System.out.println("-----------------------------------------------------------");
		
		House Roma_house = houseBuilder("Loft","775 Roma's Ave",2,2019);
		printHouseInfo(Roma_house);
		System.out.println("-----------------------------------------------------------");

		printHouseInfo(houseBuilder("Apartment","2322 my_apartment Ave",4,2019));
		
	}
	
	/*
	 * Methods
	 */
	
	public static void printHouseInfo(House house) {
		System.out.println ("Type: "+house.type);
		System.out.println ("Adress: "+house.address);
		System.out.println ("Bedrooms #: "+house.bedroom);
		System.out.println ("Year: "+house.year);
	}
	
	public static House houseBuilder (String type, String address, int bedrooms, int year) {
		House houseBuilder = new House();
		houseBuilder.address=address;
		houseBuilder.bedroom=bedrooms;
		houseBuilder.type=type;
		houseBuilder.year=year;
		
		return houseBuilder;
	}
}
