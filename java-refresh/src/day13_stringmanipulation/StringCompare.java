package day13_stringmanipulation;

public class StringCompare {
	public static void main(String[]args) {
		
		String s1 = "Anastasiia";
		String s2 = new String ("Anastasiia");
		
		boolean result = s1.equalsIgnoreCase(s2);
		System.out.println(result);
	}
}
