package com.phoenix.planets;

public class Earth extends Planet{

	@Override
	public void move() {
		System.out.println("Earth Moves");		
	}

	@Override
	public void rotate() {
		System.out.println("Earth Rotates");		
	}

	@Override
	public void revolve() {
		System.out.println("Earth Revolves");		
	}

	@Override
	public boolean supportsLife() {
		return true;
	}
	
	

}
