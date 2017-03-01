package coreHomework7;

import static coreHomework7.Colors.*;
import static coreHomework7.Technology.*;

public enum Cars {
	BMW(12, BLACK, ABS), MERCEDES(11, RED, ESP), 
	AUDI(12, SILVER, ABS), RENAULT(8, GRAY, EDS),
	SKODA(10, RED, ESP), WOLKSVAGEN(10, BLACK, EDS),
	FORD(11, GRAY, ABS), VAZ(8, SILVER, ABS);
	
	
	private final int price;
	private final Colors color;
	private final Technology technology;
	
	private Cars(int price, Colors color, Technology technology) {
		this.price = price;
		this.color = color;
		this.technology = technology;
	}

	public int getPrice() {
		return price;
	}

	public Colors getColor() {
		return color;
	}

	public Technology getTechnology() {
		return technology;
	}
	
	
	
	
	
}
