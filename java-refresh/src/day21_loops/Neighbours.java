package day21_loops;

public class Neighbours {
	public static void main(String[]args) {
		
		String txt = "naaann";
		
		for(int i=0; i<txt.length();i++) {
			if(txt.charAt(i) == txt.charAt(i+1)){
				System.out.println("Beep - "+txt.charAt(i));
			}
		}
		
	}
	
}
