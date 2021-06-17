package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable{

	private int noOfMoons;
	
	public void setData(int noOfMoons) {		
		this.noOfMoons = noOfMoons;		
	}
	
	public int getData() {		
		return noOfMoons;		
	}
	
	protected abstract boolean supportsLife();
	
	public String toString() {
		return "Number of Moons : " + getData();		
	}
}
