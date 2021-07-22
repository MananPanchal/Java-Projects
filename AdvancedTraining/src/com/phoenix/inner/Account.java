/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.inner;

public class Account {
	
	private int accNo;
	private String ownerName;
	private float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, float balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void  printDetails() {
		System.out.println(this);
	}
		
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

	// Non Static Inner Class
	public class Locker	{
		
		private int lockId;
		private String label;
		
		public Locker() {
			
		}
		
		public Locker(int lockId, String label) {
			super();
			this.lockId = lockId;
			this.label = label;
		}



		public void lock() {
			System.out.println("Account " + accNo +" is Locked");
		}
		
		public void unlock() {
			System.out.println("Account " + accNo +" is Unlocked");
		}
		
		public void keepThings() {
			System.out.println("In Account " + accNo + ", Things are kept in Locker");
		}
		
	} // End of inner class

}	// End of outer class
	