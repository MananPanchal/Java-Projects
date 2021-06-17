package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape{
	
private int side;
	
	// Default Constructor
	public Square() {
		
		side = 1;
				
	}

	// Parameterized Constructor
	public Square(int side) {
		
		this.side = side;
				
	}

	@Override
	public void calculateArea() {
		
		float area = side * side;
		System.out.println("Area of Square is : " + area);
		
	}

	@Override
	public void calculatePerimeter() {
		float perimeter = 4 * side;
		System.out.println("Perimeter of Square is : " + perimeter);
		
	}

}
