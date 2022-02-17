package day22_nested_loops;

public class NestedLoops {
	public static void main(String[]args) {
	

		for(int n=1;n<10;n++) {
			for(int i=1;i<=n;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int n=10;n>=1;n--) {
			for(int i=1;i<=n;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
}
}