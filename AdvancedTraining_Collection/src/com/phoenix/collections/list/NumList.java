/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.phoenix.comparators.CompareNum;

public class NumList {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(120);
		numList.add(150);
		numList.add(90);
		numList.add(20);
		numList.add(120);
		numList.add(100);
		
		System.out.println("Using For Loop");
		for(int i=0; i<numList.size(); i++) {
			int ele = numList.get(i);
			System.out.println(ele);			
			
		}
		
		System.out.println();
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = numList.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
			
		}
		
		System.out.println();
		
		System.out.println("Using ForEach Loop");
		for(int ele: numList) {
			System.out.println(ele);
			
		}

		System.out.println();
		
		System.out.println(numList);
		
		System.out.println();
		
		Collections.reverse(numList);
		System.out.println("Reversed List Using ForEach Loop");
		for(int ele: numList) {
			System.out.println(ele);
			
		}
		
		System.out.println();
		
		Collections.sort(numList);
		System.out.println("Sorted List Using ForEach Loop");
		for(int ele: numList) {
			System.out.println(ele);
			
		}
		
		System.out.println();
		
		Collections.reverse(numList);
		System.out.println("Reversed Sorted List Using ForEach Loop");
		for(int ele: numList) {
			System.out.println(ele);
			
		}
		
		System.out.println();
		
		Collections.sort(numList, new CompareNum());
		System.out.println("As per user-defined Comparator");
		for(int ele: numList)
			System.out.println(ele);
		
		System.out.println();
		
		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(numList, c);
		System.out.println("Using reverseOrder() method in desc order using Comparator");
		for(int ele: numList)
			System.out.println(ele);
		
		
		
		
	}

}
