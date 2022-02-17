package day25_arrays;

public class searchInArray {
	public static void main (String[]args) {
		
		int[]num= {10,20,54,52,100,7,77,34,66,5};
		int lookNum=100;
		boolean found = false;
		
		for(int i=1;i<num.length;i++) {
			if(num[i]==lookNum) {
				System.out.println("Found yay, num position is"+" "+ (i+1));
				found = true;
				break;
			}
		}
		
		if(found==false) {
			System.out.println(found + " not found");
		}
	}
}
