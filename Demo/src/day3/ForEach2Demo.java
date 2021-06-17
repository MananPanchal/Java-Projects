/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 9th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day3;

public class ForEach2Demo {

	public static void main(String[] args) {
		
		System.out.println("2D array with new keyword : ");
		int arr1[][] = new int[2][2];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		for(int i[]: arr1) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
		System.out.println("2D array without new keyword : ");
		int arr2[][] = {{10,20,30,40}, {50,60,70,80}};
		for(int i[]: arr2) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
