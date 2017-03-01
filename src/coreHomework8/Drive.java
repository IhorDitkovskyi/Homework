package coreHomework8;

public class Drive {
	private int countOfButter;

	public Drive(int countOfButter) {
		this.countOfButter = countOfButter;
	}

	public int getCountOfButter() {
		return countOfButter;
	}

	public void setCountOfButter(int countOfButter) {
		this.countOfButter = countOfButter;
	}

	@Override
	public String toString() {
		return "Drive [countOfButter=" + countOfButter + "]";
	}

}


