/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ActorPhoneMap {

	public static void main(String[] args) {
		
		Map<String, Long> actorPhMap = new HashMap<String, Long>();
		
		actorPhMap.put("Varun Dhawan", 9999999999L);
		actorPhMap.put("Amitabh Bachhan", 9898989898L);
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

	}

}
