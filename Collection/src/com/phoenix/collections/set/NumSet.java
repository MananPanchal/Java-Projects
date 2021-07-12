/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class NumSet {

	public static void main(String[] args) {
		Set<Integer> numSet = new HashSet<Integer>();
		numSet.add(120);
		numSet.add(150);
		numSet.add(90);
		numSet.add(20);
		numSet.add(120);
		numSet.add(100);
		

		System.out.println("Using Iterator");
		Iterator<Integer> it = numSet.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
			
		}
		
		System.out.println();
		
		System.out.println("Using ForEach Loop");
		for(int ele: numSet) {
			System.out.println(ele);
			
		}

		System.out.println();
		
		System.out.println(numSet);
		

	}

}
