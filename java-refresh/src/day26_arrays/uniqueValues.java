package day26_arrays;

public class uniqueValues {
	public static void main(String[]args) {
		
		int[]nums = {1,3,4,4,4,5,77};
		
		for(int i = 0; i<nums.length; i++) {
			int currentNum = nums[i];
			boolean dup = false;
			
			for(int n=0; n<nums.length;n++) {
				if(nums[n]==currentNum && i!=n) {
					dup=true;
					break;
				}
			}
			
			if(dup==false) {
				System.out.println(currentNum);
			}
			
		}
	}
}
