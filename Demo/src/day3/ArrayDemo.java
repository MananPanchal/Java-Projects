/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 9th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day3;

public class ArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("So Array with new keyword : ");
		int arr1[] = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("So Array without new keyword : ");
		int arr2[] = {10,20,30,40,50};
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
		System.out.println();
		
		System.out.print("So Array of City Names : ");
		String cityNames[] = {"Ahmedabad", "Gandhinagar", "Bhavnagar"};
		for(int i=0; i<cityNames.length; i++) {
			System.out.print(cityNames[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("So Array of Hobby Names : ");
		String hobbyNames[] = {"Cricket", "Music"};
		for(int i=0; i<hobbyNames.length; i++) {
			System.out.print(hobbyNames[i] + " ");
		}
	}

}
