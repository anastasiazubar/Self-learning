package day25_arrays;

import java.util.Random;
import java.util.Scanner;

public class LargeArray {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("How many items in array?");
		int count = input.nextInt();
		int[]nums = new int[count];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=random.nextInt(100);
		}
		
		for(int num:nums) {
			System.out.print(num+", ");
		}
		
		input.close();
	}
}
