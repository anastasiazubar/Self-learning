package day25_arrays;

public class sumOfArrays {
	public static void main (String[]args) {
		
		int[]nums = {7,3,10,5,7,3};
		
		int sum = 0;
		int sumOfEvens=0;
		int sumOfOdds=0;
		
		for(int num:nums) {
			sum+=num;
			
			if(num%2==0) {
				sumOfEvens +=num;
			}else {
				sumOfOdds +=num;
			}
		}
		
		System.out.println(sum);
		System.out.println(sumOfEvens);
		System.out.println(sumOfOdds);

	}
}
