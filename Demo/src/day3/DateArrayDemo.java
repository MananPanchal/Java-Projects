/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 9th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day3;

import day2.MyDateT;

public class DateArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("By Using New Keyword");
		MyDateT md1[] = new MyDateT[3];
		md1[0] = new MyDateT(10,6,2021);
		md1[1] = new MyDateT(20,3,2021);
		md1[2] = new MyDateT(15,8,2021);
		
		for(int i=0; i<md1.length; i++) {
			md1[i].printDate();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("By Using Without New Keyword");
		MyDateT md2[] = {new MyDateT(9,6,2021), new MyDateT(2,3,2021)};
		for(MyDateT i: md2) {
			i.printDate();
		}
		
	}

}
