/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.stacks;

import java.util.Stack;

public class NumStackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> numSt = new Stack<Integer>();
		numSt.push(40);
		numSt.push(20);
		numSt.push(70);
		numSt.push(10);
		numSt.push(80);
		numSt.push(20);
		
		System.out.println("Top of numSt: " + numSt.peek());
		
		System.out.println();
		
		int id = numSt.search(70);
		System.out.println("Element 70 is found at index number : " + id);
		
		System.out.println();
		
		System.out.println("Pop the top : " + numSt.pop());
		
		System.out.println();
		
		while(!numSt.empty())
			System.out.println("Pop the top : " + numSt.pop());

	}

}
