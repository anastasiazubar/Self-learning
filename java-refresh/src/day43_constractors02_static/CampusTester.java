package day43_constractors02_static;

public class CampusTester {
	public static void main(String[]args) {
		
		Campus.city="Charlotte";
		Campus.getCity();
		
		Campus newCity = new Campus();
		newCity.city="MosSha";
		newCity.getCity();
		
	}
}
