/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 9th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day3;

public class ForEach1Demo {

	public static void main(String[] args) {
		
		System.out.println("So Double Array with using new keyword : ");
		double arr1[] = new double[3];
		arr1[0] = 1.5;
		arr1[1] = 2.5;
		arr1[2] = 3.5;
		for(double i: arr1) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println();

		System.out.println("So Float Array without using new keyword : ");
		float arr2[] = {10.5f,20.5f,30.5f,40.5f,50.5f};
		for(float i: arr2) {
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();
		
		System.out.println("So Flowers are : ");
		String flowers[] = {"Rose", "Lotus", "Sunflower"};
		for(String i: flowers) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("So Country names are : ");
		String country[] = {"India", "Unites States of America", "Canada", "South Africa"};
		for(String i: country) {
			System.out.print(i + ", ");
		}
		
	}

}
