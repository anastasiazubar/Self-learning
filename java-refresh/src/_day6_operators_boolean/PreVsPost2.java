package _day6_operators_boolean;

public class PreVsPost2 {
	public static void main (String[]args) {
	
		int a = 1;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println("/////////////");
		
		int b = 1;
		System.out.println(b++); //1
		System.out.println(b++); //2
		System.out.println("/////////////");

		int c = 1;
		System.out.println(++c); //2
		System.out.println("/////////////");

		//more ex:
		
		int d,e;
		d=1;
		e=d++;
		/*
		 * 1. e=d
		 * 2.d++;
		 */
		System.out.println("e: "+ e); //1
		System.out.println("d: "+ d); //2

		
	}
}
