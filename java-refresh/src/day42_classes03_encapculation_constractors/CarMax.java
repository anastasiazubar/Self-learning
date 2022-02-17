package day42_classes03_encapculation_constractors;

public class CarMax {
	public static void main (String[]args) {
		
		Car car1 = new Car();
		
		car1.setMake("Acura");
		car1.setModel("ILX");
		car1.setType("Sedan");
		car1.setSpeed(35);
		
		car1.accelarate(35);
		
		System.out.println(car1.getSpeed());
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		Car car2 = new Car();
		System.out.println(" Car 2 make "+car2.getMake());
		System.out.println(" Car 2 type "+car2.getType());
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		Car car3 = new Car("Coupe","Ford","Mustang");
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getType());
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		

		
	}
}
