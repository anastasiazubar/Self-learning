package day21_loops;

public class Continue {
	public static void main (String[]args) {
		
		for(int i =1;i<7;i++) {
			System.out.println(i);
			if(i==2) {
				break;
			}
		}
		
		
		for(int n =1;n<7;n++) {
			if(n==2 || n==5) {
				continue;
			}
			System.out.println ("Value of n: "+n);
		}
		
		
	}
}
