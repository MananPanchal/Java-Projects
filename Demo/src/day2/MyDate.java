/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class MyDate {
	
	private int day, month, year;
	
	public void initDate(int d,int m,int y) {
		
		day = d;
		month = m;
		year = y;
		
	}
	
	public void printDate() {
		
		System.out.println("So the date is : " + day + "/" + month + "/" + year);
		
	}

}
