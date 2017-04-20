package oop4_5;

import java.util.ArrayList;
import java.util.List;

public class TestShapes {

	public static void main(String[] args) {
	
		
		List<Shape> shapes=new ArrayList<Shape>();
		
		shapes.add(new Circle(2,"red",true));
		shapes.add(new Square(3,"blue",false));
		shapes.add(new Rectangle(4,4,"green",true));
		for(Shape shape:shapes){
			System.out.println(shape.toString());
		}
	}
}
