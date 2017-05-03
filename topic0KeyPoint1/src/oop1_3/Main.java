package oop1_3;

public class Main {

	public static void main(String[] args) {
	
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(2.345f,2.3f);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());

		System.out.println("Rectangulo 1 perimeter?"+r1.getPerimeter());
		System.out.println("Rectangulo 2 perimeter?"+r2.getPerimeter());
		
		System.out.println("Rectangulo 1 area ?"+r1.getArea());
		System.out.println("Rectangulo 2 area ?"+r2.getArea());
	}

}
