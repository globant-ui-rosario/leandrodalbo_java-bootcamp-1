package oop6_4;

public class Circle implements GeometricObject {

	private double radius;

	public Circle() {

		this.radius = 1.0;
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


}
