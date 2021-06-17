/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package inheritance.emp;

public class WageEmp extends Employee {

	private int noOfHours;
	private float ratePerHours;
	
	// Default Constructor
	public WageEmp() {
		
		noOfHours = 0;
		ratePerHours = 0;
		
	}
	
	public WageEmp(int empId, String name, int noOfHours, float ratePerHours) {
		
		super(empId, name, (noOfHours*ratePerHours));
		this.noOfHours = noOfHours;
		this.ratePerHours = ratePerHours;
		
	}
	
	public void calculateWage() {
		
		System.out.println("Total Wage : " + (noOfHours*ratePerHours));
		
	}
	
	public void display() {
		
		super.display();
		
	}
	
	public String toString() {
		
		return super.toString() + " Employee No of Hours : " + noOfHours + " Employee Rate per Hours :" + ratePerHours;	
		
	}
}
