package day29_MultiDimentsional;

public class MultArrays_start {
	public static void main (String[]args) {
		
		
	int[][]nums = new int[2][3];
	nums[0][0]=10;
	nums[0][1]=20;
	nums[0][2]=30;
	
	nums[1][0]=40;
	nums[1][1]=50;
	nums[1][2]=60;
	
	int[][]nums2= {{10,20,30},{40,50,60,70}};
	
	System.out.println(nums2[0][0]);
	System.out.println(nums2[1][3]);
	
	
	System.out.println("Number of arrays:" + nums.length);
	System.out.println("Number of values in first array:" + nums[0].length);

	
	
}
	}

