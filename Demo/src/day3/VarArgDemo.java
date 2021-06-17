/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day3;

public class VarArgDemo {
	
	public static double average(int ...a) {
		
		int sum = 0;
		int len = a.length;
		double res;
		
		for(int i: a) {
			sum += i;
		}
		
		res = sum / len;
		return res;
	}

	public static void main(String[] args) {
		
		double avg;
		avg = average(10,20,30);
		System.out.println("So the average is :" + avg);
	}

}
