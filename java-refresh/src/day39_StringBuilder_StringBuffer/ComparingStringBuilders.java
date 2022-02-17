package day39_StringBuilder_StringBuffer;

public class ComparingStringBuilders {
	public static void main (String[]args) {
		StringBuilder b1 = new StringBuilder("java");
		StringBuilder b2 = new StringBuilder("java");

			System.out.println(b1==b2);		//false
			System.out.println(b1.equals(b2));		//false
			
			/*
			 *Only one way to compare -> need to covert to String 
			 */
			
			System.out.println(b1.toString().equals(b2.toString()));	//true
			
			StringBuilder b3 = b1;
			System.out.println(b1==b3);		//true
			System.out.println(b1.equals(b3));		//true

			b3.append(" programming");
			System.out.println(b1);		
			System.out.println(b3);		
			
	}
}
