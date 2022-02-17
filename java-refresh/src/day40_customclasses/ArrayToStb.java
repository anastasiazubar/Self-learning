package day40_customclasses;

import java.util.Arrays;

public class ArrayToStb {
	public static void main (String[]args) {
		
		String[]words = new String[5];
		words[0] = "coffee";
		words[1] = "tea";
		words[2] = "water";
		words[3] = "milk";
		words[4] = "juice";

		System.out.println(Arrays.toString(words));
	
		StringBuilder words2 = new StringBuilder();
		
		for(String word:words) {
			words2.append(word).append(" ");
		}
		System.out.println(words2);

		
	}
}
