package day40_customclasses;

public class Movie_Class {
	String name;
	int lenth;
	
	public void watch() {
		System.out.println("Watching Movies: "+name);
		System.out.println("It is : "+lenth+" minutes");
	}
	
	public void buy(double price) {
		System.out.println("Buying "+name+" movie for "+price);
	}
}
