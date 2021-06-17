package com.phoenix.living.wild;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable{

	@Override
	public void move() {
		System.out.println("Tiger Moves");				
	}

	@Override
	public void jump() {
		System.out.println("Tiger Jumps");		
	}

	@Override
	public void run() {
		System.out.println("Tiger Runs");		
	}

	@Override
	public void walk() {
		System.out.println("Tiger Walks");		
	}
	
	

}
