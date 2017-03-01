package coreHomework8;

public class Helm {
	private int radius;

	public Helm(int radius) {
		super();
		this.radius = radius;
	}
	public int addradius(int r){
		return radius+=r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Helm [radius=" + radius + "]";
	}
}
