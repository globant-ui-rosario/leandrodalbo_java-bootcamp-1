package oop1_3;

public class Rectangle {

	private float length;
	private float width;

	public Rectangle() {

	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return this.getLength() * this.getWidth();
	}

	public double getPerimeter() {
		return 2 * (this.getLength() + this.getWidth());
	}
	public String toString(){
		return "Rectangle[length="+this.getLength()+", width="+this.getWidth()+"]";         
	}
}
