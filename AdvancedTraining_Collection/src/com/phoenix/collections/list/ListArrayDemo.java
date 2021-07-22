/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 16th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		
		// Array to List Conversion
		List<Integer> numList = Arrays.asList(100,600,300,200,500,800);
		numList.forEach(System.out::println);
		
//		numList.add(12);	// Unsupported Operation
//		numList.remove(2);	// Unsupported Operation
		numList.set(2, 2000);	// Replacement is allowed
		
		
		System.out.println();
		
		
		// List to Array Conversion
		Integer [] iArr = new Integer[numList.size()];
		
		iArr = numList.toArray(iArr);
		for(int ele: iArr)
			System.out.println(ele);

	}

}
