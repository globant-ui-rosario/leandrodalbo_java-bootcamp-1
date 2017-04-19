package oop2_3;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {

		int[] arrayXY = new int[2];
		arrayXY[0] = this.getX();
		arrayXY[1] = this.getY();
		return arrayXY;

	}

	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

	public double distance(int x, int y) {

		return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
	}

	public double distance(MyPoint point) {
		return Math.sqrt(Math.pow(this.x-point.getX(), 2)+Math.pow(this.y-point.getY(), 2));
	}

	public double distance() {
		return Math.sqrt(Math.pow(this.x-0, 2)+Math.pow(this.y-0, 2));
	}
}
