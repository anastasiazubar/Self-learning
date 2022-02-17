package day25_arrays;

public class arraysPrintReserve {
	public static void main (String[]args) {
		
		int[]points= {10,2,4,54,65,77,75,40,30,7};
		
		if(points.length==10) {
			System.out.println("There is 10 numbers");
			
		}else {
			System.out.println("We need 10 numbers");
		}
		
		///////////////////////////
		for(int i=points.length-1;i>=0;i--) {
			System.out.print(points[i]+" ");
		}
		
		System.out.println();

		///////////////////////////
		
		int n = points.length-1;
		while(n>=0) {
			System.out.print(points[n--]+" ");
		}
	}
}
