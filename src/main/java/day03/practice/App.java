package day03.practice;

public class App {

	public static void main(String[] args) {
		User user1 = new User(); 
	user1.setName("santhosh");
	user1.setPassword("password123");
	user1.setEmailId("sandy@gmail.com");

	User user2 = new User("sandy", "password456", "santhosh@gmail.com"); 

	System.out.println(user1.toString()); 
	System.out.println(user2.toString());
	}
	 

}
