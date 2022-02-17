package day42_classes03_encapculation_constractors;

public class EtsyAccount {
	private String email;
	private String firstName;
	private String pwd;

	/*
	 * Methods
	 */
	
	public void setEmail(String email){
		this.email = email;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setPassword(String pwd){
		if(pwd.length()>6) {
			this.pwd = pwd;
		}else {
			System.out.println("Password should be more than 6 characters");
		}
	}
	
	public String getEmail() {
		return email;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getPassword() {
		return pwd;
	}

	public void setAccountInfo(String email,String firstName, String pwd) {
		this.email=email;
		this.firstName=firstName;
		this.pwd=pwd;
		
		setEmail(email);
		setFirstName(firstName);
		setPassword(pwd);
	}
	
	
	public String getAccountInfo() {
		return this.email + " | " + this.firstName + " | "+ this.pwd;
		
		//or return getEmail()  + " | " + getfirstName() + " | " + getPassword();
	}
}

