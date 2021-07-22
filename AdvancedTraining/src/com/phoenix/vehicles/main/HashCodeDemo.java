/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class HashCodeDemo {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println("Hashcode of s1 : " + s1.hashCode());
		System.out.println("Hashcode of s2 : " + s2.hashCode());
		
		
		Car c1 = new Car(101, "BMW", 234500.00f);
		Car c2 = new Car(101, "BMW", 234500.00f);
		
		System.out.println("Hashcode of car1 : " + c1.hashCode());
		System.out.println("Hashcode of car2 : " + c2.hashCode());	
		
		
		Car c3 = new Car(101, "Audi", 234500.00f);
		Car c4 = new Car(101, "BMW", 234500.00f);
		
		System.out.println("Hashcode of car3 : " + c3.hashCode());
		System.out.println("Hashcode of car4 : " + c4.hashCode());	
	
	
	}

}
