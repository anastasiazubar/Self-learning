package day43_constractors02_static;

public class Application {
	public static void main (String[]args) {
		
		AppUser user1 = new AppUser("superman","Roman","rp1234");
		AppUser user2 = new AppUser("spiderman","Ali","ax1234");
		AppUser user3 = new AppUser("postman","Victor","vs1234");

		user1.setCount(100);
		
		System.out.println(user1.getCount());
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());
		
		System.out.println(user1.getUserId());
		System.out.println(user2.getUserId());
		System.out.println(user3.getUserId());

		AppUser user4 = new AppUser("postman","Victor","vs1234");
		System.out.println(user4.getCount());

		
	}
}
