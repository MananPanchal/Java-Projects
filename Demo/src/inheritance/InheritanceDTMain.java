/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 11th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		
		System.out.println("Manager Parameterized Constructor");
		Employee e1 = new Manager(1,"John Doe", 10000, 500);				
		((Manager) e1).display();
		((Manager) e1).showIncentives();
		
		System.out.println();
		
		System.out.println("Employee Wage Parameterized Constructor");
		Employee e2 = new WageEmp(2, "Jane Doe", 8, 200);
		((WageEmp) e2).display();
		((WageEmp) e2).calculateWage();
	}

}
