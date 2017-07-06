package oop7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {

	private List<MyPoint> points;

	public PolyLine() {

		points = new ArrayList<MyPoint>();
	}

	public PolyLine(List<MyPoint> points) {
		this.points = points;
	}

	public void appendPoint(int x, int y) {

		MyPoint mp = new MyPoint(x, y);
		points.add(mp);
	}

	public void appendPoint(MyPoint point) {

		points.add(point);
	}

	public String toString() {
		StringBuilder st = new StringBuilder();
		for (MyPoint mp : points) {
			st.append(mp.toString());
		}
		return st.toString();
	}
}
