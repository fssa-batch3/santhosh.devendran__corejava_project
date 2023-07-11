package day02.misc;

public class Student {
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	static int count ;
	String name;
	int id;
	String email;
	static String academy;
	
	static {
		academy = "FSSA";
	}
	public Student() {
		Student.count++;
	}
	
}
