/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class MyDateP {

	private int day, month, year;
	
	// Default Constructor
	public MyDateP(){
		
		day = 8;
		month = 6;
		year = 2021;
		
	}
	
	// Parameterized Constructor
	public MyDateP(int d,int m,int y) {
		
		day = d;
		month = m;
		year = y;
		
	}

	public void printDate() {
		
		System.out.println("So the date is : " + day + "/" + month + "/" + year);
		
	}
}
