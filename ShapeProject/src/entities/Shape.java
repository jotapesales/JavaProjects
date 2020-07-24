package entities;
import entities.enums.*;

public abstract class Shape {
	private Color color;
	public abstract Double area();
	
	public Color getColor() {
		return color;
	}
	
	public Shape(String c) {
		color = Color.valueOf(c);
	}
}
