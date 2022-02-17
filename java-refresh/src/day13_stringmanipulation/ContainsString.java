package day13_stringmanipulation;

public class ContainsString {
	public static void main (String[]args) {
		
		String sens = "There are 36 collections found. Do you want to save search";
		
		boolean validateCollections = sens.contains("collections found");
		System.out.println(validateCollections);
	}
}
