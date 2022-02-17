package day28_arrays_multiD;

import java.util.Arrays;

public class ArrayBinarySearch {
	public static void main (String[]args) {
		
	String[]sweet = {"Candy","Coockie","Sugar","Chocolad","Me"};
	
	Arrays.sort(sweet);
	System.out.println(Arrays.toString(sweet));
	System.out.println(Arrays.binarySearch(sweet, "Coockie"));
	
	
	}
}
