package day26_arrays;

public class strToCharArray {
	public static void main (String[]args) {
		
		String str = "Anastasiia";
		
		char[]letters = str.toCharArray();
		for(char chr:letters) {
			System.out.print(chr+" ");
		}
		
		
		System.out.println();

		String gift = "Diamond ring";
		char[]gift_arr = gift.toCharArray();
		
		for(int i=gift_arr.length-1; i>=0; i--) {
			System.out.print(gift_arr[i]+" ");
		}
		
	}
}
