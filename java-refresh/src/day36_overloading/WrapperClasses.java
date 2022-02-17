package day36_overloading;

import java.util.ArrayList;

public class WrapperClasses {
	public static void main(String[]args) {
		
		
		ArrayList<Integer> intClass = new ArrayList<Integer>();
		intClass.add(100);
		intClass.add(1002);
		intClass.add(12);
		intClass.add(233);
		
		System.out.println(intClass);
		System.out.println(intClass.toString());

		for(Integer n:intClass) {
			System.out.println(n);
		}
		System.out.println("=======================================");
		for(int num:intClass) {
			System.out.println(num);
		}
		System.out.println("=======================================");
		for(Integer i=0;i<intClass.size();i++) {
			System.out.println(intClass.get(i));
		}
		System.out.println("=======================================");
		for(int h=0;h<intClass.size();h++) {
			System.out.println(intClass.get(h));
		}
	}
}

