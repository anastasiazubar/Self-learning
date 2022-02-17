package day28_arrays_multiD;

import java.util.Arrays;

public class ArraysEquals {
	public static void main (String[]args) {
		
		int[]a= {1,2,3};
		int[]b= {1,3,2};

		boolean result = Arrays.equals(a, b);
		System.out.println("Without sorting " + result);
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result2 = Arrays.equals(a, b);
		System.out.println("With sorting " + result2);
		
	}
}
