package day37_arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {
	public static void main (String[]args) {
		List<Integer>nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		System.out.println(nums);
		
		nums.set(0, 1000);
		System.out.println(nums);
		
		nums.set(1,nums.get(1)*2);
		System.out.println(nums);

		nums.set(nums.indexOf(300), 3);
		System.out.println(nums);

		
	}
}
