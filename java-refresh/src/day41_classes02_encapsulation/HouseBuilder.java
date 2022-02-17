package day41_classes02_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseBuilder {
	public static void main (String[]args) {

		
		House myHouse = new House();
		myHouse.address = "902 W 4th St";
		myHouse.bedroom = 1;
		myHouse.type="Apartment";
		myHouse.year=2012;
		
		House myHouse2 = new House();
		myHouse2.address = "901 W 4th St";
		myHouse2.bedroom = 3;
		myHouse2.type="TownHouse";
		myHouse2.year=2010;
		
		House myHouse3 = new House();
		myHouse3.address = "203 W 4th St";
		myHouse3.bedroom = 5;
		myHouse3.type="House";
		myHouse3.year=2019;
		
		System.out.println("House1 type: "+myHouse.type);
		System.out.println("House2 type: "+myHouse2.type);
		System.out.println("House3 type: "+myHouse3.type);
		System.out.println("-----------------------------------------------------------");

		int[]nums = new int[3];
		nums[0]= 234;
		
		String[]names=new String[3];
		names[0]="Bill";
		
		House[]houses = new House[3];
		houses[0]=myHouse;
		houses[1]=myHouse2;
		houses[2]=myHouse3;		

		for(House h: houses) {
			System.out.println(h.type +"=> " + h.address);
		}
		System.out.println("-----------------------------------------------------------");

		for(int i=0; i<houses.length; i++) {
			System.out.println(houses[i].address +" => "+ houses[i].type);	
		}
		System.out.println("-----------------------------------------------------------");

		
		//ArrayList <Integer> numList = new ArrayList<>();
		ArrayList <House> houselist = new ArrayList<>();
		
		houselist.add(myHouse);
		houselist.add(myHouse2);
		houselist.add(myHouse3);
		
		ArrayList <House> houselist2 = new ArrayList<>(Arrays.asList(houses));
		List<House> houselist3 = Arrays.asList(houses); //fix size
		
		for(House h:houselist2) {
			if(h.year>2006 && h.year<2016) {
				System.out.println(h.type+" "+h.year+" built later then 2006 and less than 2016");
				
			}
		}
		System.out.println("-----------------------------------------------------------");

		for(int j=0;j<houselist.size();j++) {
			House tempHouse = houselist.get(j);
			
			if(tempHouse.year>2006 && tempHouse.year<2016) {
				System.out.println(tempHouse.type+" "+tempHouse.year+" built later then 2006 and less than 2016");
			}
		}
		System.out.println("-----------------------------------------------------------");


	}

	public static void printHouseInfo(House house) {
		System.out.println ("Type: "+house.type);
		System.out.println ("Adress: "+house.address);
		System.out.println ("Bedrooms #: "+house.bedroom);
		System.out.println ("Year: "+house.year);

	}
}


