package day38_WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing_UnBoxing {
	public static void main (String[]args) {
		
		int i = 1000;
		Integer j = i;
		
		Double d = 4.2;
		
		boolean b = true;
		Boolean b2 = b;
		
		List<Integer>nums = new ArrayList<>();
		nums.add(433);
		int p = 55;
		nums.add(p);        //AutoBoxing
		nums.add(new Integer(77));

		int r = nums.get(0); //Unboxing
		
		Boolean bool = new Boolean (false);
		boolean boolPrim = bool; //unboxing
		
		Character chr = '*'; //auto-boxing => Character object
		char mychr = '$';
		Character chObj2 = mychr; //auto-boxing => Character object
		
		char chPrim = mychr; //unboxing 
		
		Integer intVal = new Integer(230);
		
		if(intVal==230) {
			System.out.print(true);   //Unboxing -> Int value is unboxed tp compare with primitive
		}
		
	}
}
