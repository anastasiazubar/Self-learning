package day28_arrays_multiD;

public class PrintFirstandLast {
	public static void main(String[]args) {
			
	String[]words = {"test","text","buff","break","beast","best"};
	
	
	//using charAt
	for(String w: words) {
		System.out.println(w.charAt(0)+"_"+w.charAt(w.length()-1));
	}
	
	//using Substring
	for(String word: words) {
		System.out.println(word.substring(0,1)+word.substring(word.length()-1));

	}
	
	
	}

}
