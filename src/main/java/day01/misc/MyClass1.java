package day01.misc;

public class MyClass1{
	 // Declare a static variable
   public static int staticVariable;

   public static void main(String[] args) {
       // Access the static variable using the class name
   	MyClass1.staticVariable = 10;
       System.out.println(MyClass1.staticVariable);
   }
}