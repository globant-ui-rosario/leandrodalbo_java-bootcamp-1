package oop2_3;


public class TestMyPoint {

	public static void main(String[]args){
	MyPoint P0=new MyPoint(2,2);
	MyPoint P1=new MyPoint(3,2);
	
	System.out.println(P0.distance());

	System.out.println(P0.distance(P1));
	System.out.println(P0.distance(2,2));

	System.out.println(P1.distance(P0));

		
	
	}
}
