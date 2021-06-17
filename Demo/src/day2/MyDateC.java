/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */



package day2;

public class MyDateC {

	private int day, month, year;
	
	// Default Constructor
	public MyDateC(){
		
		day = 8;
		month = 6;
		year = 2021;
		
	}
	
	public void printDate() {
		
		System.out.println("So the date is : " + day + "/" + month + "/" + year);
		
	}
	
}
