package day45_staticBloc_inheritance;

public class ClassWith_StaticBlock {
	static {
		System.out.println("This is static block, Runs only one time");
	}
	
	public ClassWith_StaticBlock(){
		System.out.println("This is constructor, runs every time when you use an object");
	}
	
	public static void staticMethod() {
		System.out.println("This is stattic method");
	}
}
