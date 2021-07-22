/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumStackArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.addLast(40);
		stack.addLast(20);
		stack.addLast(70);
		stack.addLast(10);
		stack.addLast(80);
		
		System.out.println("Top of the stack : " + stack.peekLast());
		
		System.out.println();
		
		System.out.println("Pop the top : " + stack.pollLast());
		
		System.out.println();
		
		System.out.println("Top of the stack : " + stack.peekLast());
		
		System.out.println();
		
		while(!stack.isEmpty())
			System.out.println("Pop the top : " + stack.pollLast());

	}

}
