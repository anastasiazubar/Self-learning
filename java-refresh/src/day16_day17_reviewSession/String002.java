package day16_day17_reviewSession;

import java.util.Scanner;

public class String002 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter world1");
		String world = input.next();

		int len_world = world.length();
		char lastChar_world = world.charAt(len_world-1);
		char last2Char_world = world.charAt(len_world-2);
		char firstChar_world = world.charAt(0);
		char secondChar_world = world.charAt(1);
		
		if(world.length()>=4) {
			if(lastChar_world==firstChar_world) {
				System.out.println("Firsts sameee");
			}
			if (last2Char_world==secondChar_world) {
				System.out.println("Seconds sameee");
			}else {
				System.out.println("Nothing is the sameee");
			}
		}else {
			System.out.println("ERROR");

		}

		input.close();
	}
}
