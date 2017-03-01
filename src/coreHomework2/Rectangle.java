package coreHomework2;

public class Rectangle {
	int height;
	int width;

	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
		System.out.println("Сторони прямокутника:" + "a=" + this.height + " " + "b=" + this.width);
	}

	int area() {
		System.out.println("Площа прямокутника:");
		return height*width;
	}
	int perimeter() {
		System.out.println("Периметр прямокутника:");
		return (height+width)*2;
	}
}
	