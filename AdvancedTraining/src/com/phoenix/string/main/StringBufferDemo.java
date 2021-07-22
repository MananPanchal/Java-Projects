/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.string.main;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Size : " + sb.length());
		
		sb.append("Hello");
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Size : " + sb.length());
		
		sb.append(", This is StringBufferDemo.");
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Size : " + sb.length());
		
		sb.reverse();
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Size : " + sb.length());
				
		System.out.println(sb);
		
		String s = sb.reverse().toString();
		System.out.println(s);
		
		StringBuffer sb1 = new StringBuffer("Hello World"); 
		System.out.println(sb1);
		sb1.insert(5, " Great");
		System.out.println(sb1);
		
		sb1.replace(6, 11, "Good");
		System.out.println(sb1);
		
	}

}
