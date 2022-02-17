package day24_arrays;

public class ArraysCreation {
	public static void main(String[]args) {
		
		int numbers[] = new int[5];
		numbers[0]=440;
		numbers[1]=154;
		numbers[2]=422;
		numbers[3]=325;
		numbers[4]=434;
		
		System.out.println(numbers[1]);
		numbers[1]=numbers[4]+numbers[3];
		System.out.println(numbers[1]);

		
		char[]grades = {'A','B','C','D'};
		char[]grades2 = new char[]{'A','B','C','D'};

		System.out.println(grades[1]);
		
		char myGrade = grades[0], hisGrade=grades2[3];
		System.out.println(myGrade +" greter than "+hisGrade);

	}
}
