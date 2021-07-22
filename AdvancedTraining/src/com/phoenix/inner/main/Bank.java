/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.inner.main;

import com.phoenix.inner.Account;

public class Bank {

	public static void main(String[] args) {
		
		// Outer Class Object
		Account acc = new Account(1,"John Doe", 100000);
		acc.printDetails();
		
		// Inner Class Object
		Account.Locker al1 = acc.new Locker(1, "John Doe");
		al1.unlock();
		al1.keepThings();
		al1.lock();
		
		System.out.println();
		
		Account.Locker al2 = new Account(2,"Jane Doe", 200000).new Locker(2, "Jane Doe");
		al2.unlock();
		al2.keepThings();
		al2.lock();
		
	}

}
