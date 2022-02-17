package day13_stringmanipulation;

public class StringPositions {
	public static void main (String[]args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRST";
		System.out.println(alphabet.indexOf("C"));
		//////
		
		String sens = "ABJFDVdcCAaalhdHJSX bjxheihHSXKllskxkak";
		System.out.println(sens.lastIndexOf("a"));
		System.out.println(sens.indexOf("k",36));
		System.out.println(sens.indexOf("b"));	
		
	}
}
