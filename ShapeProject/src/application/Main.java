package application;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class Main {

	public static void main(String[] args) {
		List<Shape> listShape = new ArrayList<>();
		listShape.add(new Rectangle("BLACK",4.0,5.0));
		listShape.add(new Circle("RED",3.0));
		System.out.println("SHAPE AREAS:");
		for(Shape s : listShape) {
			System.out.println(String.format("%.2f", s.area()));
		}
	}

}
