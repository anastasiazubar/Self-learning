package day29_MultiDimentsional;

import java.util.Arrays;

public class CompareArrays {
	public static void main (String[]args) {
		
		int[]arr1 = {23,76,56,74,76};
		System.out.println(Arrays.toString(arr1));
		
		int[]arr2 = arr1;
		System.out.println(Arrays.toString(arr2));

		System.out.println(arr1==arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		
		int[]arr3 = {23,76,56,74,76};
		System.out.println(arr1==arr3);
		System.out.println(Arrays.equals(arr1, arr3));
		
	}
}
