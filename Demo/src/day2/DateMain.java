/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class DateMain {

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate();
		
		d1.initDate(8, 6, 2021);
		d1.printDate();
		
		System.out.println();
		
		d2.initDate(10, 6, 2021);
		d2.printDate();

	}

}
