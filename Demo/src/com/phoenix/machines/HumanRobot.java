package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable{

	@Override
	public void jump() {
		System.out.println("HumanRobot jumps");				
	}

	@Override
	public void run() {
		System.out.println("HumanRobot runs");				
	}

	@Override
	public void walk() {
		System.out.println("HumanRobot walks");				
	}

}
