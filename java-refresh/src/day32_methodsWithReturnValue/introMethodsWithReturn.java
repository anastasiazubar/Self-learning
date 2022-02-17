package day32_methodsWithReturnValue;

public class introMethodsWithReturn {
	public static void main(String[]args) {
		int age = Age();
		System.out.println(age+" soon");
		
		System.out.println(PresidentName() + " is president of USA");

		
	}
	
	/*
	 * Methods
	 */
	
	//1
	
	public static int Age(){
		return 25;
	}
	
	public static String PresidentName() {
		return "Donald Trump";
	}
}
