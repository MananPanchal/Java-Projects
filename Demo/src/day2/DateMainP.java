/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class DateMainP {

	public static void main(String[] args) {
		
		// Default Constructor
		MyDateP md1 = new MyDateP();
		
		// Parameterized Constructor
		MyDateP md2 = new MyDateP(20,6,2021);
		
		md1.printDate();
		System.out.println();
		md2.printDate();

	}

}
