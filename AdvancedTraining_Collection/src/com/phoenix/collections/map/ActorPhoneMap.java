/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ActorPhoneMap {

	public static void main(String[] args) {
		
		// Map<String, Long> actorPhMap = new HashMap<String, Long>();	// Unordered and Unsorted
		
		// Map<String, Long> actorPhMap = new LinkedHashMap<String, Long>();	// Ordered and Unsorted
		
		NavigableMap<String, Long> actorPhMap = new TreeMap<String, Long>();	// Ordered and Sorted
		
		// Comparator<String> c = Collections.reverseOrder();
		// Map<String, Long> actorPhMap = new TreeMap<String, Long>(c);	// Ordered and Sorted in Desc
		
		actorPhMap.put("Varun Dhawan", 9999999999L);
		actorPhMap.put("Amitabh Bachchan", 9898989898L);
		actorPhMap.put("Raj Kapoor", 8888888888L);
		actorPhMap.put("Akshay Kumar", 7777777777L);
		actorPhMap.put("Anil Kapoor", 7878787878L);
		
		System.out.println("Phone No of Varun Dhawan: " + actorPhMap.get("Varun Dhawan"));
		
		System.out.println();
		
		System.out.println(actorPhMap);
		
		System.out.println();
		
		Set<String> actors = actorPhMap.keySet();
		Iterator<String> it = actors.iterator();
		while(it.hasNext()) {
			String actorName = it.next();
			long phoneNo = actorPhMap.get(actorName);
			System.out.println("Actor : " + actorName + "\t Phone Number : " + phoneNo);
		}
		
		
		NavigableMap<String, Long> navMap1 = actorPhMap.headMap("Anil Kapoor", false);
		System.out.println(navMap1);
		
		NavigableMap<String, Long> navMap2 = actorPhMap.headMap("Anil Kapoor", true);
		System.out.println(navMap2);
		
		NavigableMap<String, Long> hdMap1 = actorPhMap.tailMap("Anil Kapoor", false);
		System.out.println(hdMap1);
		
		NavigableMap<String, Long> hdMap2 = actorPhMap.tailMap("Anil Kapoor", true);
		System.out.println(hdMap2);

		SortedMap<String, Long> subMap = actorPhMap.subMap("Anil Kapoor", "Varun Dhawan");
		System.out.println(subMap);

	}

}
