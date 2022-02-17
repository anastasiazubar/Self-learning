package day25_arrays;

public class CountMatches {
	public static void main (String[]args) {
		
		int count = 0;
		double[]prices = {12.32, 23.32, 80.54, 425.23, 1.32, 0.70, 1.32, 14.23, 19.23, 12.32};
		
		for(double price:prices) {
			if(price>20.0) {
				count++;
			}
		}
		
		
		if(count==0) {
			System.out.println("No items for more than $20");
		}
		System.out.println(count+" items are more than $20");
		
	}			

}
