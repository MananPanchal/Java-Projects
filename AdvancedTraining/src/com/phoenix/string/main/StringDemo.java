/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.string.main;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		if(s1 == s2)
			System.out.println("Single Object");
		else
			System.out.println("Different Objects");
		
		
		String s3 = "Hello";
		String s4 = new String("Hello");
		
		if(s3 == s4)
			System.out.println("Single Object");
		else
			System.out.println("Different Objects");
		
		if(s3.equals(s4))
			System.out.println("Same Object");
		else
			System.out.println("Different Objects");
		
		
		// Switch - Case
		String color = "green";
		switch(color) {
			case "red":
				System.out.println("Red Color");
				break;
			case "green":
				System.out.println("Green Color");
				break;
			case "blue":
				System.out.println("Blue Color");
				break;
			default:
				System.out.println("No Color");
				break;
		}

	}

}
