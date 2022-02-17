package day39_StringBuilder_StringBuffer;

public class StringBuilderExample {
	public static void main (String[]args) {
		
		
		///////////////////////////////////////////////////////
		System.out.println("----------------Task 1----------------");
		///////////////////////////////////////////////////////
		StringBuilder stb1 = new StringBuilder("Halloween");
		System.out.println(stb1);
		
		///////////////////////////////////////////////////////
		System.out.println("----------------Task 2----------------");
		///////////////////////////////////////////////////////
		StringBuilder stb2 = new StringBuilder();
		stb2.append("java");
		System.out.println(stb2);
		stb2.append(",SQL"+",C#").append(",HTML");
		System.out.println(stb2);

		///////////////////////////////////////////////////////
		System.out.println("----------------Task 3----------------");
		///////////////////////////////////////////////////////
		StringBuilder listBuilder = new StringBuilder("Wooden Spoon");
		listBuilder.append(",Iron Spoon");
		System.out.println(listBuilder);
		
		listBuilder.append('|');
		System.out.println(listBuilder);

		listBuilder.append(344);
		System.out.println(listBuilder);

		///////////////////////////////////////////////////////
		System.out.println("----------------Task 4----------------");
		///////////////////////////////////////////////////////
		StringBuilder letters = new StringBuilder("ABCDEFGH");
		letters.append("OPR");
		letters.append("ZXY");
		System.out.println(letters);
		
		letters.delete(0, 4);
		System.out.println(letters);

		letters.delete(5, 100);
		System.out.println(letters);

		///////////////////////////////////////////////////////
		System.out.println("----------------Task 5----------------");
		///////////////////////////////////////////////////////
		StringBuilder snt = new StringBuilder("Java is fun!");
		snt.reverse();
		System.out.println(snt);

		snt.deleteCharAt(0);
		System.out.println(snt);
		
		snt.deleteCharAt(snt.length()-1);
		System.out.println(snt);
		
		///////////////////////////////////////////////////////
		System.out.println("----------------Task 6----------------");
		///////////////////////////////////////////////////////
		StringBuilder txt = new StringBuilder("Selenium is the way to make moneeey");
		txt.insert(txt.length(), "/to Offers");
		System.out.println(txt);

		txt.insert(txt.length()-6,10000);
		System.out.println(txt);
		
		txt.replace(0, txt.indexOf(" "), "Appium");
		System.out.println(txt);

		
		}
}
