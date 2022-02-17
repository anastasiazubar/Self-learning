package day28_arrays_multiD;

public class CountEvents {
	public static void main (String[]args) {
		
		int[]nums = {1,2,3,4,5,6,7,8,9};
		
		int counter = 0;
		
		for (int n: nums) {
			if(n%2==0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
