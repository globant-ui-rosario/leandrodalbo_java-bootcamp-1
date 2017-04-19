package oop1_2;

public class Circle {
	
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		
		return Math.PI*Math.pow(this.getRadius(), 2);
	}
	
	public double getCircumference(){
		return Math.PI * 2 * this.getRadius();
	}

	public String toString(){
		
		return "Circle[radius="+this.getRadius()+"]";
	}

	

}
