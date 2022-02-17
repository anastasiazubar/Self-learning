package day13_stringmanipulation;

public class StartEndWord {
	public static void main(String[]args) {
		
		String word1 = "check";
		String word2 = "kitty";
		
		if (!(word1.length()==5 && word2.length() ==5)) {
			System.out.println("Should be exactly 5 char");
		}else if(word1.charAt(4) == word2.charAt(0)){
			System.out.println("Fizzz");
		}else {
			System.out.println("BuZz");
		}
		
	}
}
