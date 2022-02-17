package day16_day17_reviewSession;

public class DynamicString {
	public static void main (String[]args) {
				
		String text = "Hello! I will learn Java and will find a new job Yeay";
		
		int learn = text.indexOf("learn");
		learn += "learn".length();
		int willFind = text.indexOf("and will");
		
		String Learning_rezult =text.substring(learn,willFind);
		System.out.println(Learning_rezult.trim());
		
		
	}
}
