package day29_MultiDimentsional;

import java.util.Arrays;

public class CarsMultiD {
	public static void main (String[]args) {
		
		String[][]cars = {
				{"Honda","Toyota","Kia","Acura","Lexus","Nissan"},
				{"Audi","Mers","BMW","Porsche"},
				{"Ford","Jeep","Mustang","Tesla"},
				{"Ferrari","Maserati","Lamba"}
		};
		
		///for i
		for(int i=0;i<cars.length;i++) {
			switch(i) {
			case 0:
				System.out.print("Japanese: ");
				break;
			case 1:
				System.out.print("German: ");
				break;
			case 2:
				System.out.print("American: ");
				break;
			case 3:
				System.out.print("Italian: ");
				break;
			}
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		///for each
		for(String[]carGroup: cars) {
			for(String car:carGroup) {
				System.out.print(car+" ");	
			}
			System.out.println();
		}
		
		System.out.println("================================");

		//toString
		for(String[]carGroup: cars) {
			System.out.println(Arrays.toString(carGroup));
		}
		
		System.out.println("================================");
		
	}
}
