package day42_classes03_encapculation_constractors;

public class Car {
	private String type;
	private String make;
	private String model;
	private int speed;
	
	public Car() {
		System.out.println("Car class constructor");
		type = "unknown";
		make = "unknown";
		model = "unknown";
	}
	
	public Car(String type, String make, String model) {
		System.out.println("3 args constructor");
		this.type = type;
		this.make=make;
		this.model=model;
	}
	
	public void accelarate(int mph) {
		speed+=mph;
		System.out.println(make+" "+type+" is accelarating");
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
