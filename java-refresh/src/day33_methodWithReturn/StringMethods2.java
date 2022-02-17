package day33_methodWithReturn;

public class StringMethods2 {
	public static void main(String[]args) {
		System.out.println(countTimes("Anastasiia","a"));
	}
	
	/*
	 * Method: countTimes
	 * Return_type: int
	 */
	
	public static int countTimes(String str,String chr) {
		int countTimes=0;
		
		for(int i = 0;i<str.length();i++) {
			if(str.substring(i,i+1).equals(chr)) {
				countTimes++;
			}
		}
		
		return countTimes;
	}
}
