package coreHomework6;

public class Wheel {
	private int radius;
	private double width;
	private double height;
	
	public Wheel(int radius, double width, double height) {
		this.radius = radius;
		this.width = width;
		this.height = height;
	}

	public void increaseRange(){
		radius+=1;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", width=" + width + ", height=" + height + "]";
	}
	
	
	
}
