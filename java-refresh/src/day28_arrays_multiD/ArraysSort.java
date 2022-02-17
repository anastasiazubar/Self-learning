package day28_arrays_multiD;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[]args) {
		
		int[]nums = {4,76,564,23,3,32,22,34,1,2};
		
		for(int n: nums) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		Arrays.sort(nums);
		for(int n: nums) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println();

		
		////////////////////////////////////////////////////

		
		String[]names = {"Anastasiia","Anna","Babe","Khalili","Kate","Olivia","John","Said"};
		
		Arrays.sort(names);
		for(String name: names) {
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println();

		////////////////////////////////////////////////////

		char[]arraySort = {'c','d','C','D','s','S'};
		Arrays.sort(arraySort,0,3); //partial sort
		for(char chr: arraySort) {
			System.out.print(chr+" ");
		}
		System.out.println();
		System.out.println();

		
	}
}
