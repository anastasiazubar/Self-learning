package day28_arrays_multiD;

public class Has55together {
	public static void main (String[]args) {
		
		int nums[]= {45,34,23,12,34,5,15,51,5,33};
		
		boolean found = false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==5 && nums[i+1]==5) {
				found = true;
				break;
			}
		}
		System.out.println("Found 5 near 5: " + found);
		
	}
}
