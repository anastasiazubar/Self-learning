package day16_day17_reviewSession;

public class String001 {
	public static void main (String[]args) {
		
		//1
		String text = "Heeey! What's up?";
		int lenn = text.length();
		System.out.println(lenn);
		
		//2
		System.out.println(text.substring(lenn-1));
		    //or
		char LastChar = text.charAt(lenn-1);
		System.out.println(LastChar);

	}
}
