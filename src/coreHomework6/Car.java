package coreHomework6;

public class Car {
	private String brand;
	private Steering steering;
	private Wheel wheel;
	private Body body;

	public Car(String brand, Steering steering, Wheel wheel, Body body) {
		super();
		this.brand = brand;
		this.steering = steering;
		this.wheel = wheel;
		this.body = body;
	}
	
	public Car(String brand, String type, int radius, double width, double height, String color) {
		super();
		this.brand = brand;
		this.steering = new Steering(type);
		this.wheel = new Wheel(radius, width, height);
		this.body = new Body(color);
	}



	/////////////// Делегований метод/////////////
	public void increaseRange() {
		wheel.increaseRange();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Steering getSteering() {
		return steering;
	}

	public void setSteering(Steering steering) {
		this.steering = steering;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", steering=" + steering + ", wheel=" + wheel + ", body=" + body + "]";
	}

}
