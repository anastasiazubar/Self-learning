package day18_loops;

public class PrintEvents {
	public static void main (String[]args) {
		
		int num = 1;
		
		while(num <=100) {
			if(num%2 == 0) {
				System.out.println(num+" this number is even, so i print it");
			}
		num++;
		}
		
	}
}
