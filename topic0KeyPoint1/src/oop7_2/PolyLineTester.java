package oop7_2;

public class PolyLineTester {

	public static void main(String[] args){
		
		
		PolyLine pl=new PolyLine();
		pl.appendPoint(new MyPoint(3,3));
		pl.appendPoint(new MyPoint(3,5));
		pl.appendPoint(new MyPoint(5,3));
		pl.appendPoint(new MyPoint(30,456));
		
		System.out.println(pl.toString());
	}
}
