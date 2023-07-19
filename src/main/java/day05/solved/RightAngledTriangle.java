package day05.solved;

//import day05.solved.Polygon;

public class RightAngledTriangle implements Polygon {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating RightAngledTriangle area");
		return (0.5 * a * b);
	}

}
