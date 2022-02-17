package day28_arrays_multiD;

import java.util.Arrays;

public class ArrayCopyof {
	public static void main (String[]args) {
		
	int[]a = {10,20,30};
	int[]b=Arrays.copyOf(a, 2);
	System.out.println(Arrays.toString(b));
			
	int[]c = Arrays.copyOf(a, 5);
	System.out.println(Arrays.toString(c));
	
	a=Arrays.copyOf(a, 5);
	System.out.println(Arrays.toString(a));
	a[3]=100;
	System.out.println(Arrays.toString(a));



	}
}
