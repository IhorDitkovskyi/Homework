package coreHomework8;

public class Car {
	private Helm helm;
	private Wheel wheel;
	private Body body;
	private Drive drive;

	public Car(Helm helm, Wheel wheel, Body body, Drive drive) {
		super();
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
		this.drive = drive;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
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

	public Drive getDrive() {
		return drive;
	}

	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	@Override
	public String toString() {
		return "Car [helm=" + helm + ", wheel=" + wheel + ", body=" + body
				+ ", drive=" + drive + "]";
	}

	public int addradius(int r) {
		return helm.addradius(r);
	}

	public int getRadius() {
		return helm.getRadius();
	}

	public void setRadius(int radius) {
		helm.setRadius(radius);
	}

	public double countOFkm() {
		return wheel.countOFkm();
	}

	public String getColor() {
		return body.getColor();
	}

	public void pickUP() {
		body.pickUP();
	}
}


