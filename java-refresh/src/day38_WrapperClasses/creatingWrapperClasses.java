package day38_WrapperClasses;

public class creatingWrapperClasses {
	public static void main(String[]args) {
		Integer n1 = new Integer(200);
		System.out.println(n1);
	/*
		Integer n2 = Integer.valueOf(234);
		Integer n3 = Integer.parseInt("2334");
		
		Double d1 = new Double(123.45);
		Double d2 = Double.valueOf(23.12);
		Double d3 = Double.parseDouble("984.32");
		
		//Similar for other classes as well
		
		Character chr1 = new Character('A');
		Character chr2 = Character.valueOf('@');
	*/	
		char ch3 = '3';
		System.out.println(Character.isDigit(ch3));
		
	}
}
