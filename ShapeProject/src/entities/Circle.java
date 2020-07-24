package entities;

import java.lang.Math;
public final class Circle extends Shape {
	private Double radius;
	
	public Circle(String c, Double r) {
		super(c);
		radius = r;
	}
	
	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
