package com.phoenix.inner;

// Outer Class
public class Car {
	
	public void show() {
		ferrari.test();
		d.drive();
	}
	
	
	// Anonymous Inner Class - subclass of Ferrari
	Ferrari ferrari = new Ferrari() {
		
		private String model;
		
		{
			model = "Ferrari Sport";
		}
		
		public void showModel() {
			System.out.println(model);
		}
		
		// Overridden Method
		public void test() {
			showModel();
			System.out.println("Anonymous " + model);
		}
		
	};
	
	
	// Anonymous Inner Class - Interface
	
	Drivable d = new Drivable() {
		
		@Override
		public void drive() {
			
			System.out.println("Anonymous Driving..");
			
		}
	};

}
