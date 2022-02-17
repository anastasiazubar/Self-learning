package day21_loops;

public class Continue_Break {
	public static void main (String[]args) {
		
		for (int i=1;i<=50;i++) {
			
			if(i%5 == 0) {
				continue;
			}else if (i%2==0) {
				break;
			}else {
				System.out.println("Number is "+i);
			}
			
		}
		
	}
}
