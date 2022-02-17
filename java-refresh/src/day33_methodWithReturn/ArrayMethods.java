package day33_methodWithReturn;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
	public static void main(String[]args) {
		
		//Task 1
		int[]nums = array_numbers(9);
		System.out.println(Arrays.toString(nums));
		
		//Task2
		System.out.println("/////////////////////////////");
		compareArrays(6,6);
	}
	
	/*
	 * Method getIntArray with random numbers
	 */
	
	public static int[]array_numbers(int countOfArray){
		int[]nums=new int[countOfArray];
		Random rnd = new Random();
		
		for(int i=1;i<nums.length;i++) {
			nums[i]=rnd.nextInt(100);
		}
		return nums;
	}
	
	public static void compareArrays(int countOfArray1,int countOfArray2) {
		int[]firstArray = array_numbers(countOfArray1);
		System.out.println(Arrays.toString(firstArray));
		int[]secondArray = array_numbers(countOfArray2);
		System.out.println(Arrays.toString(secondArray));

		
		int sumOfNum1 = 0;
		int sumOfNum2 = 0;
		
		for(int num:firstArray) {
			sumOfNum1+=num;
		}
		for(int num:secondArray) {
			sumOfNum2+=num;
		}
		
		if(sumOfNum1>sumOfNum2) {
			System.out.println("FirstArray is bigger than second");
			System.out.println("sum Of Num in Array - "+sumOfNum1);
		}else if(sumOfNum1<sumOfNum2) {
			System.out.println("SecondArray is bigger than first");
			System.out.println("sum Of Num in Array - "+sumOfNum2);
		}else if (sumOfNum1==sumOfNum2) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("ERROR");
		}
	}
	
	
}
