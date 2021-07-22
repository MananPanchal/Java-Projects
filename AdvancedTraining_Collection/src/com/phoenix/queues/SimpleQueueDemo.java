/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueueDemo {

	public static void main(String[] args) {
		
		// Queue<Integer> numQ = new LinkedList<Integer>(); // FIFO or LILO
		
		// Queue<Integer> numQ = new PriorityQueue<Integer>();
		
		Queue<Integer> numQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		numQ.add(100);
		numQ.offer(50);
		numQ.offer(20);
		numQ.add(70);
		numQ.add(50);
		
		System.out.println("Head of numQ: " + numQ.peek());
		System.out.println("Removing Head of numQ: " + numQ.poll());
		System.out.println("Head of numQ: " + numQ.peek());
		
		System.out.println();
		
		while(!numQ.isEmpty()) {			
			System.out.println("Polling Element: " + numQ.poll());			
		}
		
		System.out.println();
		
		System.out.println("Head of numQ: " + numQ.peek());
		System.out.println("Polling Element: " + numQ.poll());	
		// System.out.println("Head of numQ: " + numQ.element());
		// System.out.println("Head of numQ: " + numQ.remove());

	}

}
