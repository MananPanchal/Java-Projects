package com.phoenix.inner.main;

import com.phoenix.inner.Outer;

public class StaticNestedDemo {

	public static void main(String[] args) {
		
		Outer.Inner in = new Outer.Inner();
		in.show();			

	}

}
