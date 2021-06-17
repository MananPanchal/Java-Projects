/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package containment.date;

public class Employee {

	private int empId;
	private String name;
	MyDate birthDate;
	
	public Employee() {
		
		empId = 0;
		name = "abc";
		birthDate = new MyDate(1,1,2021);
		
	}
	
	public Employee(int empId, String name, MyDate birthDate) {
		
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
		
	}
	
	public void setEmployeeData(int empId, String name, MyDate birthDate) {
		
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
		
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public MyDate getBirthDate() {
		return birthDate;
	}
	
	public void display() {		
		System.out.println("Employee : " + empId + " " + name + " " + birthDate);		
	}
	
	public String toString() {		
		return "Employee : " + empId + " " + name + " " + birthDate;		
	}
}
