package coreHomework8;

public class Wheel {
	private double speed;
	private double time;
	public Wheel(double speed, double time) {
		super();
		this.speed = speed;
		this.time = time;
	}
	public double countOFkm(){
		return speed*time;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Wheel [speed=" + speed + ", time=" + time + "]";
	}
}
