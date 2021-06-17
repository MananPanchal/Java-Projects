package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;

public class InterfaceMain {
		
	public static void main(String[] args) {
		
		Movable m1,m2,m3;
		
		System.out.println("Earth Object: ");
		m1 = new Earth();
		((Planet) m1).setData(1);
		System.out.println(m1.toString());
		((Earth) m1).move();
		((Earth) m1).rotate();
		((Earth) m1).revolve();
		System.out.println("Life is on earth: " + ((Earth) m1).supportsLife());
		
		System.out.println();
		
		System.out.println("Jupiter Object: ");
		m2 = new Jupiter();
		((Planet) m2).setData(79);
		System.out.println(m2.toString());
		((Jupiter) m2).move();
		((Jupiter) m2).rotate();
		((Jupiter) m2).revolve();
		System.out.println("Life is on earth: " + ((Jupiter) m2).supportsLife());
		
		
	}

}
