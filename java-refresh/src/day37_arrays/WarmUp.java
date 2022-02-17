package day37_arrays;

import java.util.ArrayList;


public class WarmUp {
	public static void main(String[]args) {
		
		ArrayList<String>cities=new ArrayList<>();
		ArrayList<String>longName=new ArrayList<>();
		
		
		cities.add("Washington DC");
		cities.add("Miami");
		cities.add(0,"Wickonsin");
		cities.add("Boston");
		cities.add(1,"Chicago");
		
		System.out.print(cities);
		System.out.println();

		for(String city:cities) {
			if(city.length()>6) {
				longName.add(city);
			}
		}
		System.out.print(longName);
		System.out.println();

		longName.clear();
		System.out.print(longName);
	
		
		//List<String>=Arrays.asList(new String[]{"Washington","Boston","Chicago","Arlingtom"});
	}
	
}
