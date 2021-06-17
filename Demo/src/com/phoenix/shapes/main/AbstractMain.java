package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		
				
		Shape c1 = new Circle(5);
		c1.calculateArea();
		c1.calculatePerimeter();
		
		System.out.println();
		
		Shape r1 = new Rectangle(10, 5);
		r1.calculateArea();
		r1.calculatePerimeter();
		
		System.out.println();
		
		Shape s1 = new Square(10);
		s1.calculateArea();
		s1.calculatePerimeter();
	}

}
