package oop1_2;

public class Main {

	public static void main(String[] args) {
	
		Circle c1=new Circle();
		Circle c2=new Circle(2.3);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("C1 AREA ?"+c1.getArea());
		System.out.println("C2 AREA ?"+c2.getArea());
		
		System.out.println("C1 CIRCUMFERENCE ?"+c1.getCircumference());
		System.out.println("C2 CIRCUMFERENCE ?"+c2.getCircumference());
		
	}

}
