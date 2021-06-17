package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Cat extends Animal implements Walkable {

	@Override
	public void jump() {
		System.out.println("Cat Jumps");			
	}

	@Override
	public void move() {
		System.out.println("Cat Moves");			
	}

	@Override
	public void run() {
		System.out.println("Cat Runs");			
	}

	@Override
	public void walk() {
		System.out.println("Cat Walks");			
	}

}
