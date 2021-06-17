package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape{
	
	private int length, breadth;
	
	// Default Constructor
	public Rectangle() {
		
		length = 1;
		breadth = 1;
		
	}

	// Parameterized Constructor
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
		
	}

	@Override
	public void calculateArea() {
		
		float area = length * breadth;
		System.out.println("Area of Rectangle is : " + area);
		
	}

	@Override
	public void calculatePerimeter() {
		float perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle is : " + perimeter);
		
	}

}
