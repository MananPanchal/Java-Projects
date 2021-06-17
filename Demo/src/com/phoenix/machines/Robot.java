package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable{
	
	void processData() {
		System.out.println("Robot is processing data");		
	}

	void senseInfo() {
		System.out.println("Robot is sensing information");		
	}
	
	void useArtificialIntelligence() {
		System.out.println("Robot is using Artificial Intelligence");		
	}
	
	@Override
	public void move() {
		System.out.println("Robot moves");		
	}

}
