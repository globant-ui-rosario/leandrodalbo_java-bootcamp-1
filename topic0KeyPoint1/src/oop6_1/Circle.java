package oop6_1;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		super();
		this.radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(this.getRadius(), 2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * this.getRadius();
	}

	@Override
	public String toString() {

		return "A Circle with radius=" + this.getRadius() + ", which is a subclass of " + super.toString();
	}
}
