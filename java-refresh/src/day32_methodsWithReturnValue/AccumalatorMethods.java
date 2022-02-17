package day32_methodsWithReturnValue;

public class AccumalatorMethods {
	public static void main(String[]args) {

	int[]nums = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
	
	for(int n:nums) {
		System.out.println(GetStars(n));
	}
	}
	
	public static String GetStars(int num) {
		String stars = "";
		for(int i = 1;i<=num; i++) {
			stars +="*";
		}
		return stars;
	}
}
