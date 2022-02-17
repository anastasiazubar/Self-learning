package day32_methodsWithReturnValue;

public class getFirstLastName {
	public static void main (String[]args) {
		
		String old_email="anastasiia_zubar@bofa.com";
		String FirstName, LastName,newEmail;
		
		FirstName = GetName(old_email);
		//System.out.println(FirstName);
		LastName = GetLastName(old_email);
		//System.out.println(LastName);

		
		newEmail = BuiltNewEmail( FirstName, LastName );
		System.out.println(newEmail);
		
	}
	
	/*
	 * Methods
	 */
	
	//1 Get Name 
	public static String GetName(String email) {
		String[] name = email.split("_");
		return name[0];
	}
	public static String GetLastName(String email) {
		String[] name_splt = email.split("_");
		String[] name = name_splt[1].split("@");
		return name[0];
	}
	
	public static String BuiltNewEmail(String FirstName,String LastName ) {
		String email = FirstName + "_"+LastName +"@gmail.com";
		return email;
	}
	
	
}
