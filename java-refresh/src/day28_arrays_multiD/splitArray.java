package day28_arrays_multiD;

public class splitArray {
	public static void main (String[]args) {
		
		String email = "anastasiia.zubar@bofa.com";
		String[]email_splitted = email.split("@");
		
		System.out.println("Name - "+email_splitted[0]);
		System.out.println("domain - "+email_splitted[1]);

		
	}
}
