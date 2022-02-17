package day16_day17_reviewSession;

public class Substrings01 {
	public static void main (String[]args) {
			String languages = new String("Java, javascript,ruby,c#,vbscript");
			String lan1,lan2,lan3;
			
			lan1=languages.substring(0,4);
			lan2=languages.substring(6, 16);
			lan3=languages.substring(17,21);
			
			System.out.println(lan1);
			System.out.println(lan2);
			System.out.println(lan3);


	}
}
