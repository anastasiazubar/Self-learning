package day37_arrays;

import java.util.ArrayList;

public class MethodsWithList {
	public static void main (String[]args) {
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(100);
		nums.add(23);
		nums.add(2333);
		nums.add(12);
		
		System.out.println(sumList(nums));
	}
	
	public static int sumList(ArrayList<Integer>nums) {
		int sum = 0;
		for(int num:nums){
			sum+=num;
		}
		return  sum;
		
	}
}
