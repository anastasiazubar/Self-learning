package day12_classobject_strings;

public class SringClass {
	public static void main (String[]args) {
		
		String name = "Anastasiia "; 
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		name = name.toUpperCase();
		System.out.println(name);

		System.out.println((name.trim()).length());
		
		char secondchar = name.charAt(1);
		System.out.println(secondchar);


	}
}
