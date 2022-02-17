package day25_arrays;

public class findSmallestValue {
	public static void main(String[]args) {
		
		int[]nums = {732,3453,-34,34,3,1,3,34,34,2,-22,-333,21,-324};
		
		int smallest = nums[0];
		for(int num: nums) {
			
			smallest=num<smallest? num:smallest;
			
		}
		System.out.println("Smallest num is "+smallest);
	}
}
