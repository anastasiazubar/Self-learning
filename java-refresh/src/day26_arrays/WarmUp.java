package day26_arrays;

public class WarmUp {
	public static void main (String[]args) {
		
		int[]nums= {1,2,3,4,5,6,7,8,9};
		
		//TASK 1+2
		for(int num:nums) {
			System.out.print(num+" ");
		}
		System.out.println();

		//TASK 3+4
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				nums[i]*=2;
			}else {
				nums[i]*=3;
			}
			System.out.print(nums[i]+" ");
		}
		
	}
}
