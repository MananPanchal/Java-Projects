package com.phoenix.statics.imports.main;

import com.phoenix.vehicles.Car;

import static com.phoenix.vehicles.Car.count;

import static java.lang.Integer.parseInt;

public class StaticImportDemo {

	public static void main(String[] args) {
		
		int a = parseInt("20");
		System.out.println(a);
		
		int b = parseInt("700");
		System.out.println(b);
		
		System.out.println("No of Car Objects : " + count);
		
		Car c1 = new Car();
		Car c2 = new Car(121, "Mercedes Benz", 4530000.00f);
		
		System.out.println("No of Car Objects : " + count);

	}

}
