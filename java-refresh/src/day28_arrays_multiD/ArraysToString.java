package day28_arrays_multiD;

import java.util.Arrays;

public class ArraysToString {
	public static void main (String[]args) {
		
		int []nums = {1,3,4,5,6,7,4};	
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
	}
}
