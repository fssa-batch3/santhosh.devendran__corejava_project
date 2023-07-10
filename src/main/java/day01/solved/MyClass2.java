package day01.solved;

public class MyClass2 {
	   public int instanceVariable;

	    public static void main(String[] args) {
	        // Create an object of MyClass
	    	MyClass2 myObject = new MyClass2();

	        // Access the instance variable using the object reference
	        myObject.instanceVariable = 5;
	        System.out.println(myObject.instanceVariable);
	    }
}
