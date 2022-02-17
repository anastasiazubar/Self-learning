package day20_loops;

public class Accumulator {
	public static void main(String[]args) {
		
		int sum = 0;
		for(int i = 1; i<=5;i++) {
			sum +=i;		
		}
		System.out.println("Sum is " + sum);
		
		
		System.out.println("=========================");

		int sumofOdds, sumoffEvens;
		
		sumofOdds=0;
		sumoffEvens=0;
		
		for(int j = 0; j<=100; j++) {
			
			if(j%2 == 0) {
				sumoffEvens+=j;
			}else {
				sumofOdds+=j;
			}	
		}
		
		System.out.println("sumofOdds "+sumofOdds);
		System.out.println("sumoffEvens "+sumoffEvens);

		
		
		
	}
}
