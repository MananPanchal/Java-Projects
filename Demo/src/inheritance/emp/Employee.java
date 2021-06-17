/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package inheritance.emp;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	// Default Constructor
	public Employee(){
		empId = 0;
		name = "abc";
		salary = 0;
	}
	
	// Parameterized Constructor
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	// Parameterized Constructor
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	
	protected void display() {
		
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}
	
	public String toString() {
		
		return "Employee : " + empId + " " + name + " " + salary;	
		
	}
}
