package com.phoenix.inner;

public class Outer {
	
	private int i;
	
	public Outer() {
		i = 100;
	}
	
	public void display() {
		System.out.println("i : " + i);
	}
	
	// Static Inner Class
	public static class Inner{
		
		private int j;
		private static int c;
		
		public Inner() {
			j = 10;
		}
		
		public Inner(int j) {
			super();
			this.j = j;
		}
		
		public void show() {
			System.out.println("j : " + j);
		}
	}

}
