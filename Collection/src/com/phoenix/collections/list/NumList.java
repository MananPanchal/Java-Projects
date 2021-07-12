/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
	}

}
