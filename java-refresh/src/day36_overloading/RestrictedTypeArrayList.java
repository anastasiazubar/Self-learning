package day36_overloading;

import java.util.ArrayList;

public class RestrictedTypeArrayList {
	public static void main (String[]args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("Anastasiia");
		names.add("Roma");
		names.add("Leila");
		System.out.println(names);
		
		names.add("James");
		names.add("Ali");
		System.out.println(names);
		
		int l = names.size();
		System.out.println(l);
		
		//remove
		names.remove(0);
		System.out.println(names);
		
		names.add("Anastasiia");
		System.out.println(names);

		names.remove("Anastasiia");
		System.out.println(names);

	}
}
