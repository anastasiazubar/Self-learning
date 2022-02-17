package day21_loops;

import java.util.Scanner;

public class FindUniqueCharacter {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		String txt = input.next();
		String result_txt="";
		
		for(int i=0; i<txt.length();i++) {
						
			if(!result_txt.contains(txt.substring(i, i+1))) {
				result_txt+=txt.substring(i, i+1);
			}
		
		}
			System.out.println(result_txt);
		input.close();
	}
}
