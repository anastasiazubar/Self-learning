package day43_constractors02_static;

public class TVRunner {
	public static void main (String[]args) {
		
		TV newTV = new TV();
		TV smartTV = new TV("Sharp");
		TV cakeTV = new TV("HP");
		
		System.out.println(newTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());

		
		newTV.turnOn();
		smartTV.turnOn();
		
		newTV.setChannel(20);
		smartTV.setChannel(55);
		
		System.out.println(newTV.getChannel());
	}
}
