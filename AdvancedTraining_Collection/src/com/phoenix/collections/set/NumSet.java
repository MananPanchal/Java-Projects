/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparators.CompareNum;


public class NumSet {

	public static void main(String[] args) {
		// Set<Integer> numSet = new HashSet<Integer>(); // Unordered and Unsorted
		
		// Set<Integer> numSet = new LinkedHashSet<Integer>(); // Ordered but Unsorted
		
		// Set<Integer> numSet = new TreeSet<Integer>(); // Ordered and Sorted
		
		// Set<Integer> numSet = new TreeSet<Integer>(new CompareNum()); // Ordered and Sorted in Desc
		
		Set<Integer> numSet = new TreeSet<Integer>(Collections.reverseOrder()); // Ordered and Sorted in Desc
		
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
