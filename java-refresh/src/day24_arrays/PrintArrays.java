package day24_arrays;

public class PrintArrays {
	public static void main (String[]args) {
		
		String[]cars = new String[] {"Moskwich","Audi","Porshe","Kia","Mers","BMW","Ford","Ferrari"};
		
		for(int i=1;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		for(String car: cars) {
			System.out.print(car+" ");
		}
		
		
	}

}
