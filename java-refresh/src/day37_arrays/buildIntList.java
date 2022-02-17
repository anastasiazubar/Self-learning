package day37_arrays;

import java.util.ArrayList;
import java.util.Random;

public class buildIntList {
	public static void main (String[]args) {
		
		System.out.println(builtIntList(23));
		
		ArrayList<Integer> randomList=builtIntList(23);
		System.out.println(randomList);

	}


	public static ArrayList<Integer>builtIntList (int count) {
		Random arraylist_random = new Random();
		ArrayList<Integer> randomlist = new ArrayList<>();
		for(int i=1;i<count;i++){
			randomlist.add(arraylist_random.nextInt(1000));
		}
		
		return randomlist;
	}
}
