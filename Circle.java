package src.com.batch3pm.test;





public class Circle extends Shape {
	
	private double radius;
	private static final double PI = 3.14;
	
	public double area() {
		return radius*radius*PI;
	}
	
	public Circle(double radius) {
	
		this.radius=radius;
		
	}
	public double getRadius() {
		return radius;
	}
}
