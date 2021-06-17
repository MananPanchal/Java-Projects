/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class DateMainSG {

	public static void main(String[] args) {
		
		MyDateSG md1 = new MyDateSG();
		MyDateSG md2 = new MyDateSG(10,11,2021);
		
		System.out.println("By Default Constructor");
		md1.setDate(8,6,2021);;
		
		int d = md1.getDay();
		System.out.println("Day is : " + d);
		int m = md1.getMonth();
		System.out.println("Month is : " + m);
		int y = md1.getYear();
		System.out.println("Year is : " + y);
		
		md1.printDate();
		
		System.out.println();
		
		System.out.println("By Parameterized Constructor");
		
		int a = md2.getDay();
		System.out.println("Day is : " + a);
		int b = md2.getMonth();
		System.out.println("Month is : " + b);
		int c = md2.getYear();
		System.out.println("Year is : " + c);
		
		md2.printDate();

	}

}
