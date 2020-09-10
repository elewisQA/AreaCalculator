package shapes;

public class Circle implements Shape {
	//---[ Class Variables ]---
	private double radius;
	
	//---[ Class Constructor(s) ]---
	public Circle() {
		radius = 0.0;
	}
	
	//---[ Class Methods ]---
	public int calculateArea() {
		double area = 3.14 * (radius * radius);
		return (int) area;
	}

	//---[ Getters & Setters ]---
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
