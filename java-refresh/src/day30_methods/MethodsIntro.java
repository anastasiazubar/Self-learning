package day30_methods;

import day31_methods.Calculator;

public class MethodsIntro {

	public static void main (String[]args) {
		sayHello() ;
		sayHelloTo("Nastya");
		Calculator.Add(30, 2);
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	public static void sayHelloTo(String name) {
		System.out.println("Hello "+name);
	}

}
