package day25_arrays;

import java.util.Scanner;

public class findLargesinArray {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of num");
		int count = input.nextInt();
		
		int[]nums = new int[count];
		
		System.out.println("Enter numbers");
		for(int i = 0; i<count;i++) {
			nums[i]=input.nextInt();
			System.out.println("It is "+(i+1)+" num");
		}
		
		for(int n:nums) {
			System.out.print(n+", ");
		}
		System.out.println();
		
		int largest = nums[0];
		
		for(int num:nums) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println("Largest value "+largest);
		
		
		input.close();
	}
}
