/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee{

	private double incentives;
	
	// Default Constructor
	public Manager() {
		
		incentives = 0;
		
	}
	
	// Parameterized Constructor
	public Manager(int empId, String name, double salary, double incentives) {
		
		super(empId, name, salary);
		this.incentives = incentives;
				
	}
	
	public void showIncentives() {
		
		System.out.println("Incentives : " + incentives);
		
	}
	
	public void display() {
		
		super.display();
		
	}
	
	public String toString() {
		
		return "Manager : " + super.toString() + " Incentives : " + incentives;	
		
	}
}

