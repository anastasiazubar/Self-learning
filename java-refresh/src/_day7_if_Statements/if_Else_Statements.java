package _day7_if_Statements;

public class if_Else_Statements {
	public static void main (String []args) {
		
		double coffeePrice = 8.50;
		
		if (coffeePrice<6.0) {
			System.out.println("I'll get coffee");
		}else{
			System.out.println("I'll not get coffee! It is expensive");
		}
		
		System.out.println("///////////////////////////////////");

		
		double accountBalance = 450.50;
		double price = 700;
		
		if (price<=accountBalance) {
			System.out.println("Yeyyy! I'll by it");
		}else{
			System.out.println("I don't have money! time to go home");
		}
		System.out.println("///////////////////////////////////");

				
	}
}
