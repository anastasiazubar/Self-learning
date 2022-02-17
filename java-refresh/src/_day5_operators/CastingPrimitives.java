package _day5_operators;

public class CastingPrimitives {
	public static void main(String[]arg) {
		
		int i = 100;
		byte b = (byte)i;
		
		System.out.println(b);
		System.out.println("=====================");
		
		//implicit casting examples:
		int i1=121212;
		double d1 = i1 ;
		System.out.println(d1);
		
		//explicit casting
		int i2=3452;
		short s2 = (short) i2;
		
		System.out.println(s2);
		
	}
}
