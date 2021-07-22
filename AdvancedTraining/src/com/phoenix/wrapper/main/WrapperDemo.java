/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.wrapper.main;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int a = 10;
		Integer i1 = Integer.valueOf(a);	// Wrapping
		System.out.println(i1);
		
		int c = Integer.valueOf(20);	// Unwrapping
		System.out.println(c);
		
		String s = "200";
		int b = Integer.parseInt(s);
		System.out.println(b);

		Boolean b1 = Boolean.valueOf("Hello");
		System.out.println(b1);
		Boolean b2 = Boolean.valueOf("True");
		System.out.println(b2);
		Boolean b3 = Boolean.valueOf(null);
		System.out.println(b3);
		
		int m = Integer.max(20, 100);
		System.out.println("Max Value : " + m);
		
	}

}
