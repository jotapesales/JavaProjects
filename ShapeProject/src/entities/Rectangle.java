package entities;

public final class Rectangle extends Shape{
	private Double width,height;
	
	public Rectangle(String c, Double w, Double h) {
		super(c);
		width = w;
		height = h;
	}
	
	@Override
	public Double area() {
		return width*height;
	}
}
