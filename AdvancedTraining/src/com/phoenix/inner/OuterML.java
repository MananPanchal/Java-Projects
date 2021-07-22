package com.phoenix.inner;

// outer class
public class OuterML {
	
	public void show() {
		
		int a = 10;	// Local Variable
		
		class Inner{
			
			private int x;
			
			public Inner() {
				x = 7000;
			}
			
			public Inner(int x) {
				super();
				this.x = x;
			}
			
			public void test() {
				System.out.println("x : " + x);
				
				System.out.println("Method Variable a : " + a);
			}
			
		} // End of Local Inner class
		
		Inner in = new Inner();
		in.test();
		
	}	// End of local method

}	// End of outer class
