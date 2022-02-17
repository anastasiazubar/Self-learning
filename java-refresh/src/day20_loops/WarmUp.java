package day20_loops;

import java.util.Scanner;

public class WarmUp {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		int start,end;
		
		System.out.println("Enter start number");
		start = input.nextInt();
		System.out.println("Enter end number");
		end = input.nextInt();
		
		if(start>end){
			while(start>=end) {
				System.out.println("Step number "+start);
				start--;
			}
		}else if(start<end){
			while(start<=end) {
				System.out.println("Step number "+start);
				start++;
			}
		}else {
			System.out.println("Numbers can not be equal");
		}
		
		input.close();
		
	}
}
