package day19_loops;

public class SnackTime {
	public static void main(String []args) {
		
		/*
		boolean hungry = true;
		int apple = 1;
		
		while(apple<=5) {
			System.out.println("Eatsss "+apple);
			apple++;
		}
		hungry = false;
		
		System.out.println("Am I hungry "+ hungry);
		*/
		//2nd view
		
		boolean hungry2 = true;
		int apple2 = 1;
		
		while(hungry2) {
			
			System.out.println("Eatsss "+apple2);

			if(apple2 == 5) {
				hungry2 = false;
			}
			apple2++;
		}
		
	}
}
