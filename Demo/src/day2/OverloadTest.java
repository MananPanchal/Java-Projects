/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day2;

public class OverloadTest {

	public static void main(String[] args) {
		
		MathEngine m1 = new MathEngine();
		
		System.out.println("So the result of multiplication is : " + m1.multiply(10, 20));
		m1.multiply(10, 20, 30);
		System.out.println("So the result of multiplication is : " + m1.multiply(20.5F, 10));
		System.out.println("So the result of multiplication is : " + m1.multiply(10, 1.5F));

	}

}
