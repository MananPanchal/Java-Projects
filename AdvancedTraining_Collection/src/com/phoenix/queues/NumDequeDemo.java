/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class NumDequeDemo {

	public static void main(String[] args) {
		
		// Deque<Integer> deq = new LinkedList<Integer>();
		
		Deque<Integer> deq = new ArrayDeque<Integer>();
		
		deq.add(100);
		deq.add(200);
		deq.addFirst(150);
		deq.addFirst(180);
		deq.addLast(120);
		deq.addLast(130);
		
		System.out.println("Front of deq : " + deq.peek());
		System.out.println("First element of deq : " + deq.peekFirst());
		System.out.println("Last element of deq : " + deq.peekLast());

		System.out.println("Polling Element : " + deq.poll());
		System.out.println("Polling Element : " + deq.pollFirst());
		System.out.println("Polling Element : " + deq.pollLast());
		System.out.println(deq);
		
	}

}
