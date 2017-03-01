package coreHomework8;

public class Body {
	private int weight;
	private int height;
	private String color;

	public Body(int weight, int height, String color) {
		super();
		this.weight = weight;
		this.height = height;
		this.color = color;
	}

	public void pickUP() {
		System.out.println("Body pickUp");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [weight=" + weight + ", height=" + height + ", color="
				+ color + "]";
	}
	
}

