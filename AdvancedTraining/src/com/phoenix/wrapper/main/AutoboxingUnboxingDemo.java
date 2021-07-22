package com.phoenix.wrapper.main;

public class AutoboxingUnboxingDemo {

	public static void main(String[] args) {
		
		// Wrapping
		int a = 10;
		Integer i1 = Integer.valueOf(a);	// wrapping
		System.out.println(i1);
		
		// Unwrapping
		int b = i1.intValue();
		System.out.println(b);
		
		// Autoboxing
		int x = 500;
		Integer i2 = x;
		System.out.println(i2);
		
		// Autounboxing
		int y = i2;	
		System.out.println(y);
		
		// Autoboxing
		Boolean b1 = true;
		System.out.println(b1);
		
		// Autounboxing
		boolean b2 = b1;
		System.out.println(b2);
		
		// Autoboxing
		char ch = 'd';
		Character c1 = ch;
		System.out.println(c1);
		
		// Autounboxing
		char ch2 = c1;
		System.out.println(ch2);
		
		
		// Object - Primitive Compares
		Integer i3 = 100;
		float f1 = 100.0f;
		if(i3 == f1)
			System.out.println("True");
		else
			System.out.println("False");
	
	}

}
