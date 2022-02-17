package day18_loops;

public class StairCasr {
	
	public static void main (String[]args) {
	/*
	 *
	 **
	 ***
	 ****
	 *****
	 ******
	 */
	
		String stairs = "";
		int count = 1;
		
		while(count<=7) {
			stairs+="*";
			System.out.println(stairs);
			count++;
		}
		
	}

 
}
