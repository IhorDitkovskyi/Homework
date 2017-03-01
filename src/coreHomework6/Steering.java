package coreHomework6;

public class Steering {
	private String type;

	public Steering(String type) {
		
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Steering [type=" + type + "]";
	}
	
	
}
