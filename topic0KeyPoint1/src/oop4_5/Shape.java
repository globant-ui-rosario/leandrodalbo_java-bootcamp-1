package oop4_5;

public class Shape {

	private String color;
	private boolean filled;

	public Shape() {
		this.color = "red";
		this.filled = true;

	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString(){
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("A Shape with color of ");
		stringBuilder.append(this.getColor()+" and ");
		
		if(this.isFilled())
			stringBuilder.append("filled");
		else
			stringBuilder.append("Not filled");
		
		return stringBuilder.toString();
		
	}
}