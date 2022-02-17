package day42_classes03_encapculation_constractors;

public class EtsyAccountRegistration {
	public static void main (String[]args) {
		
		EtsyAccount newUser = new EtsyAccount();
		EtsyAccount newUser2 = new EtsyAccount();
		EtsyAccount newUser3 = new EtsyAccount();
		EtsyAccount newUser4 = new EtsyAccount();


		newUser.setEmail("anastasiia.zubar@gmail.com");
		newUser.setFirstName("Anastasiia");
		newUser.setPassword("anastasiia");

		newUser2.setEmail("ana.lala@gmail.com");
		newUser2.setFirstName("Anna");
		newUser2.setPassword("password_Ana");
		
		newUser3.setEmail("vikki.bull@gmail.com");
		newUser3.setFirstName("Vikki");
		newUser3.setPassword("password_Vikki");
		
		System.out.println("USER 1: "+"Email: "+newUser.getEmail()+" | "+"FirstName: "+newUser.getfirstName()+" | "+"Password: "+newUser.getPassword());
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("USER 2: "+"Email: "+newUser2.getEmail()+" | "+"FirstName: "+newUser2.getfirstName()+" | "+"Password: "+newUser2.getPassword());
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("USER 3: "+"Email: "+newUser3.getEmail()+" | "+"FirstName: "+newUser3.getfirstName()+" | "+"Password: "+newUser3.getPassword());
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		newUser4.setAccountInfo(newUser.getEmail().replace("gmail", "yahoo"), "java", "120K_pwd");
		System.out.println("USER 4: "+"Email: "+newUser4.getEmail()+" | "+"FirstName: "+newUser4.getfirstName()+" | "+"Password: "+newUser4.getPassword());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		EtsyAccount newUser5 = new EtsyAccount();
		newUser5.setAccountInfo(newUser3.getEmail().replace("gmail", "new_email"), "java", "120K_pwd");
		String accountInfo_newUser5 = newUser5.getAccountInfo();
		System.out.println(accountInfo_newUser5);
		
	}
}
