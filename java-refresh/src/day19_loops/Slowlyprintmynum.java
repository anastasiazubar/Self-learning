package day19_loops;

public class Slowlyprintmynum {
	public static void main (String[]args) throws InterruptedException {
		
		int num = 1;
		while(num<=10) {
			System.out.println ("num "+num);
			Thread.sleep(1000);
		num++;	
		}
		
	}
}
