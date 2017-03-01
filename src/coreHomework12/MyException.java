package coreHomework12;

public class MyException extends RuntimeException {

	private static final long serialVersionUID = 396864173977634402L;

	@Override
	public void printStackTrace() {
		System.err.println("Сам догадайся де помилка");
	}
	

}
