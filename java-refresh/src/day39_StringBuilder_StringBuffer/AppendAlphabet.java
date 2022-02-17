package day39_StringBuilder_StringBuffer;

public class AppendAlphabet {
	public static void main(String[]args) {

		StringBuilder alpabet = new StringBuilder();
		for(char ch='A';ch<='Z';ch++) {
			alpabet.append(ch).append(" ");
		}
		System.out.print("English alpabet: " + alpabet);
	}
}
