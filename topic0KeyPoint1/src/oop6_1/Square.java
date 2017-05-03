package oop6_1;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public void setSide(double side) {
		this.setLength(side);
		this.setWidth(side);
	}

	public double getSide() {

		return this.getLength();
	}

	@Override
	public double getPerimeter() {

		return 4 * this.getSide();
	}

	@Override
	public double getArea() {
		return Math.pow(this.getSide(), 2);
	}

	@Override
	public String toString() {
		return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
	}

}
