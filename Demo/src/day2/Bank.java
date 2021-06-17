/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day2;

public class Bank {

	public static void main(String[] args) {
		
		System.out.println("BANK ACCOUNT");
		System.out.println();
		
		System.out.println("First Interest Rate : " + Account.getInterestRate());
		System.out.println();
		
		//Default Constructor
		Account a1= new Account();
		
		a1.setAccount(1, "John Doe", 10000, 3);
		a1.setInterestRate(0.5F);
		
		System.out.println("Account Number : " + a1.getAccNo());
		System.out.println("Owner Name : " + a1.getOwnerName());
		System.out.println("Balance : " + a1.getBalance());
		System.out.println("Duration in Years : " + a1.getDurationYears());
		System.out.println("Interest Rate : " + a1.getInterestRate());
		System.out.print("Simple Interest : "); 
		a1.calculateInterest();
		
		System.out.println();
		System.out.println();
		
		//Parameterized Constructor
		Account a2= new Account(2,"Jane Doe", 50000, 5);
		a2.printDetails();
		
		System.out.println();
		
		System.out.println("Objects Count : " + Account.getCount());
		
	}

}
