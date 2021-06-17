package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle  implements Movable, Runnable{

	@Override
	public void run() {
		System.out.println("Car Runs");			
	}

	@Override
	public void move() {
		System.out.println("Car Moves");		
	}
	
	@Override
	protected void start() {		
		System.out.println("Car Starts");		
	}
	
	@Override
	protected void stop() {
		System.out.println("Car Stops");		
	}

}
