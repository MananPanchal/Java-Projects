package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape{
	
	private float radius;
	
	// Default Constructor
	public Circle() {
		
		radius = 1;
		
	}

	// Parameterized Constructor
	public Circle(float radius) {
		
		this.radius = radius;
		
	}
	
	@Override
	public void calculateArea() {
		
		float area;		
		area = MATH_PI * radius * radius;
		System.out.println("Area of Circle is : " + area);
	}

	@Override
	public void calculatePerimeter() {
		
		float perimeter;
		perimeter = 2 * MATH_PI * radius;
		System.out.println("Perimeter of Circle is : " + perimeter);
		
	}
}
