package main;

import shapes.*;

public class Runner {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setLength(5);
		rect.setWidth(3);
		
		System.out.println(rect.calculateArea());

		Circle cir = new Circle();
		cir.setRadius(5.5);
		
		System.out.println(cir.calculateArea());
	}

}
