package day43_constractors02_static;

public class AppUser {
	private String userId;
	private String name;
	private String psw;
	private static int count;
	
	/*
	 * Constructors
	 */
	
	public AppUser() {
		count++;
	}
	public AppUser(String userId, String name, String psw) {
		super();
		this.userId = userId;
		this.name = name;
		this.psw = psw;
		count++;
	}

	/*
	 * Methods
	 */
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}	

