package day33_methodWithReturn;

public class StringMethod {
	public static void main(String[]args) {
	 System.out.println(Reverse("ana"));
	 System.out.println(isPolindrom("java"));

	}
	
/*
 * Method: reverse
 * Parameters: 1String
 * ReturnValue: String
 */
	public static String Reverse(String str) {
		String reverse_str="";
				for(int i=str.length()-1;i>=0;i--) {
					reverse_str+=str.charAt(i);
		}
		return reverse_str;
	}
	
	public static Boolean isPolindrom(String str) {
		String reverse_str="";
		boolean isPolindrom = true;
		for(int i=str.length()-1;i>=0;i--) {
			reverse_str+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse_str)) {
			isPolindrom = true;
		}else {
			isPolindrom = false;
		}
		return isPolindrom;
	}
	
	public static Boolean isPolindromV2(String str) {
		String reverse_str="";
		boolean isPolindrom = true;
		Reverse(str);
		if(str.equalsIgnoreCase(reverse_str)) {
			isPolindrom = true;
		}else {
			isPolindrom = false;
		}
		return isPolindrom;
	}
}
