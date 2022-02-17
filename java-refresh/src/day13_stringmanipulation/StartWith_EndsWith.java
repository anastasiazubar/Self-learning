package day13_stringmanipulation;

public class StartWith_EndsWith {
	public static void main (String[]args) {
		
	String sens = " Bla Bla Bla this is javvaaaa";
	
	System.out.println(sens.startsWith(" "));
	System.out.println(sens.endsWith("javvaaaa"));
	
	System.out.println(!sens.isEmpty());
	System.out.println(sens.substring(0,4));

	

		
	}
}
