/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package containment.date;

public class MyDate {
	
	private int day, month, year;
	
	public MyDate() {
		
	}
	
	public MyDate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public void setDate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public int getDay() {
		return day;	
	}
	
	public int getMonth() {		
		return month;		
	}
	
	public int getYear() {		
		return year;		
	}
	
	public void printDate() {		
		System.out.println(day + "/" + month + "/" + year);		
	}

	public String toString() {		
		return day + "/" + month + "/" + year;		
	}
	
}
