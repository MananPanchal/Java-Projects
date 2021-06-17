/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class MyDateT {

	private int day, month, year;
	
	public MyDateT() {
		
		this.day = 8;
		this.month = 6;
		this.year = 2021;
		
	}
	
	public MyDateT(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public void printDate() {
		
		System.out.println("So the date is : " + day + "/" + month + "/" + year);
		
	}
	
}
