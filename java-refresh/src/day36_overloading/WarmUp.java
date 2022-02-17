package day36_overloading;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[]args) {
		
		int[] arr1= {34,6,75,3,2,3,3,23};
		int[] arr2= {34,6,90,3,2,3,3,23};

		System.out.println(Arrays.toString(AddValues_inArray(arr1,arr2)));
		
	}
	
	/*
	 * Methods
	 * 
	 */
	
	public static int[]AddValues_inArray(int[]arr1,int[]arr2) {
		
		int arr3[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		return arr3;
	}
}
