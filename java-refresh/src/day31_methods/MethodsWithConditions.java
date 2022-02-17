package day31_methods;

import java.util.Arrays;

public class MethodsWithConditions {
	
	public static void main (String[]args) {
		getLarge(4,6);
		
		int[]arr_num= {23,34,43,0,100};
		getLargeNumInArray(arr_num);
		
		getLargeNumInArray(new int[] {394,542,5,35,3,3,0,301,100});
		
		StepsJumps(-4);
		
	}
	
	/*
	 * Methods below
	 */
	
	// Get largest num from 2 numbers
	public static void getLarge(int num1, int num2){
		if(num1==num2) {
			System.out.println("Numbers are equil");
		}else if(num1>num2) {
			System.out.println("Number 1 large then number 2");
		}else {
			System.out.println("Number 2 large then number 1");
		}
	}
	
	// Get largest num from array
	public static void getLargeNumInArray(int[]nums){
		if(nums.length==0) {
			System.out.println("Error:Array is empty");
			return;
		}else {
			Arrays.sort(nums);
			System.out.println(nums[nums.length-1]);
		}
	}
	
	//Steps and jumps count 
	
	public static void StepsJumps(int times) {
		if(times==0) {
			System.out.println("Sit");
		}else if (times>0) {
			for(int i = 1; i<=times; i++) {
				System.out.println("Step "+i);
			}
		}else if(times<0) {
			for(int n=1;n<=times*(-1);n++) {
				System.out.println("Jump "+n);
			}
		}
		
		
	}
}
