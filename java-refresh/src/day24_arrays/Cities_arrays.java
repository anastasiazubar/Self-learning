package day24_arrays;

public class Cities_arrays {
	public static void main (String[]args) {
		
		String[]cities; 
		cities = new String[3];
		
		cities[0]="Washington";
		cities[1]="Chicago";
		cities[2]="Boston";

		String[] cities2 = {"Washington","Chicago","Boston","Miami"};
		
		
		System.out.println(cities2.length);
		
		String city = cities[2];
		System.out.println(city.length());
		
	}
}
