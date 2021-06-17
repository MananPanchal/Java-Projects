/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package day2;

public class Account {

	// Non-static data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	// Static data members
	private static float interestRate;
	private static int count;
	
	static {
		interestRate = 0.05F;
	}
	
	public Account() {
		accNo = 0;
		ownerName = "abc";
		balance = 0;
		durationYears = 0;
		count++;
	}
	
	public Account(int accNo, String ownerName, double balance, float durationYears) {
		
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = durationYears;
		count++;
		
	}
	
	// Non-Static Setter-Getter Methods
	public void setAccount(int accNo, String ownerName, double balance, float durationYears) {
		
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = durationYears;
		
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public float getDurationYears() {
		return durationYears;
	}
	
	
	// Static Setter-Getter Methods
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	
	public static float getInterestRate() {
		return Account.interestRate;
	}

	public static int getCount() {
		return Account.count;
	}
	
	
	public void calculateInterest() {
		
		double res = balance * interestRate * durationYears / 100;
		System.out.println(res);
	}
	
	public void printDetails() {
		
		System.out.println("Account Number : " + getAccNo());
		System.out.println("Owner Name : " + getOwnerName());
		System.out.println("Balance : " + getBalance());
		System.out.println("Duration in Years : " + getDurationYears());
		System.out.println("Interest Rate : " + getInterestRate());
		System.out.print("Simple Interest : "); 
		calculateInterest();
		
	}
}
