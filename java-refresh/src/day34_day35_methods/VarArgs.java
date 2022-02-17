package day34_day35_methods;

public class VarArgs {
	
	public static void main (String[]args) {
		sum(10,20);
		sumAll();
		sumAll(3,43,5,3,3,3,23,2);
		
		//Task
		ShoppingList("apple","banana","citrus","kiwi");
		ShoppingList("macaroon","choco","coffee");
		String[]myList= {"shirts","shoes","t-shirt"};
		ShoppingList(myList);

	}
	/*
	 * Methods
	 */
	
	public static void sumAll(int...nums) {
		System.out.println(nums.length);
		int sum = 0;
		for(int num:nums) {
			sum+=num;
		}
		System.out.println("Sum: "+sum);
				
	}
	
	public static void sum (int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	//Shopping list method
	
	public static void ShoppingList(String...products) {
		
		for(String product:products) {
			System.out.print(product+" ");
		}
		
		System.out.println();
	}
}
