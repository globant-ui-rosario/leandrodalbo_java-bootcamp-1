package oop6_1;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle() {
		super();
		this.length = 1.0;
		this.width = 1.0;

	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;

	}

	public Rectangle(double length, double width, String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.getLength() * this.getWidth();
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.getLength() + this.getWidth());
	}

	@Override
	public String toString() {
		return "A Rectangle with width=" + this.getWidth() + " and length=" + this.getLength() + ", which is a subclass of "
				+ super.toString();
	}
}
