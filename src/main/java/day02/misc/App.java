package day02.misc;

public class App {
	
public static void main(String[] args) {
		
		Academy academy = new Academy();
		
		academy.setCode("FSSA");
		academy.setName("Freshworks");
		academy.setId(007);
		
		Student student1 = new Student();
		
		student1.setName("Naandhan");
		student1.setId(213);
		student1.setEmail("en_email@www.domain.com");
		System.out.println(Student.count);
		
		Student student2 = new Student();
		
		student2.setName("Yaaro");
		student2.setId(213);
		student2.setEmail("en_email@www.domain.com");
		System.out.println(Student.count);
		
		Student student3 = new Student();
		
		student3.setName("Manadhile");
		student3.setId(213);
		student3.setEmail("en_email@www.domain.com");
		System.out.println(Student.count);
	}
}

