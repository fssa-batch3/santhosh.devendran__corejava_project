package day04.practice;

import day04.solved.Rectangle;

public class App {
	public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculateArea());
        System.out.println("Circumference: " + rectangle.calculateArea());
        RightAngledTriangle triangle = new RightAngledTriangle(3, 4);
        System.out.println("\nRight-Angled Triangle:");
        
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Circumference: " + triangle.perimeter());
    }

}