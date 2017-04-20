package oop6_4;

public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle() {
		super();
	}
	
	@Override
	public void resize(int percent) {
		
		this.setRadius(this.getRadius()+((this.getRadius()*percent)/100));
	}

}
