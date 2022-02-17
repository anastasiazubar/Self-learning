package day23_loopsReview;

//import java.util.Scanner;

public class WarmUp {
	public static void main(String[]args) {
		
		
		//(703)6063052 or 7036063052
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter phone num");
		String phoneNumber = input.next();
		String areaCode = "";
		String state ="";

		if(phoneNumber.length()==12 ||phoneNumber.length()==10) {
			
			if(	phoneNumber.startsWith("(")) {
				phoneNumber=phoneNumber.replace("(", "");
				phoneNumber=phoneNumber.replace(")", "");
				System.out.println("phone num: "+phoneNumber);
			}
			areaCode=phoneNumber.substring(0,3);
			
						switch (areaCode){
						case"202":
							state = "Washingron DC";
							break;
						case "703":
							state ="Virginia";
							break;
						case "312":
							state = "Illinois";
							break;
						default:
							state = "Not USA";
							break;
						}
						
			System.out.println("You are from "+state+" state");
						
			for(int i=0;i<phoneNumber.length();i++) {
				if(!(phoneNumber.charAt(i)>='0')&&phoneNumber.charAt(i)<='9') {
					System.out.println("Invalid characters, num must be 0-9 "+phoneNumber.charAt(i));
					return;
				}
				System.out.println("All numbers are fine");
			}
			
		}else {
			System.out.println("Please enter correct phone num");
		}
		
		
		input.close();		
		*/
	}
	
}
