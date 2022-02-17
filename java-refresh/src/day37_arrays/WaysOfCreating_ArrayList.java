package day37_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaysOfCreating_ArrayList{
	public static void main (String[]args) {
		
		//1st way
		ArrayList<String> language = new ArrayList<>();
		language.add("C#");
		language.add("Phyton");
		language.add("Vbscript");
		language.add("Java");
		language.add("JS");
		
		//1st way
		ArrayList<String> fruits1 = new ArrayList<>();
		
		//2nd way 
		List<String>fruits2=new ArrayList<>();
		
		//3rd way
	//	List<String>fruits3=new ArrayList<>(100);

		//4th way
	//	List<String>fruits4=new ArrayList<>(fruits2);

		//5th way
		List<String>fruits5=Arrays.asList(new String[] {"WaterMelon","Mango","Peach","Pineapple"});
					//fruits5.remove or fruits5.add -> UnsupportedOperationException
		List<String>fruits6=new ArrayList<>(fruits5);
					fruits6.add("Kiwi");
		List<String>fruits7=new ArrayList<>(Arrays.asList(new String[] {"Cherry","Straberry","Plump"}));
					fruits7.add("Banana");
					
		//add Values
					
		fruits1.add("Grapes");
		fruits1.add("Apple");
		fruits1.add("Blackberries");
		fruits1.add(0,"Oranges");
		fruits1.add(3,"Straberries");
		
		System.out.print(fruits1);
		System.out.println();

		fruits2.addAll(fruits1);
		fruits2.add("DragonFruit");
		System.out.println(fruits2);

		fruits1.remove(0);
		fruits1.remove("Apple");

		System.out.println(fruits1);

		fruits2.removeAll(fruits1);
		System.out.println(fruits2);

		fruits1.clear();
		System.out.println(fruits1);
		
		///Problem with removing integer 
	
		List<Integer>nums=new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		nums.remove(new Integer(3));
		System.out.println(nums);
		nums.remove(1);
		System.out.println(nums);


	}
}
