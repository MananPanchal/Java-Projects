/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		if(s1.equals(s2))
			System.out.println("Same Contents");
		else
			System.out.println("Different Contents");
		
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		if(s3.equals(s4))
			System.out.println("Same Contents");
		else
			System.out.println("Different Contents");
		
		
		Car c1 = new Car(101, "BMW", 234500.00f);
		Car c2 = new Car(101, "BMW", 234500.00f);

		if(c1.equals(c2))
			System.out.println("Same Cars");
		else
			System.out.println("Different Cars");
		
		
		// Check Car object is equal to String object
		if(c1.equals(s2))
			System.out.println("Same Contents");
		else
			System.out.println("Different Contents");
		
		
		// StringBuffer compares references 
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		if(sb1.equals(sb2))
			System.out.println("Same Contents");
		else
			System.out.println("Different Contents");
		
		
		
	}

}
