/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceMain {

	public static void main(String[] args) {
		
		System.out.println("Employee Details :- ");
		System.out.println();
		
		// Employee Parameterized Constructor
		System.out.println("Employee Parameterized Constructor");
		Employee e1 = new Employee(1, "John Doe", 30000);
		//e1.display();
		System.out.println(e1.toString());
		
		System.out.println();
		
		// Manager Default Constructor
		System.out.println("Manager Default Constructor");
		Manager m1 = new Manager();
		m1.showIncentives();
		m1.display();
		System.out.println(m1.toString());
		
		System.out.println();
		
		// Manager Parameterized Constructor
		System.out.println("Manager Parameterized Constructor");		
		Manager m2 = new Manager(2, "Jane Doe", 50000, 1000);
		m2.showIncentives();
		m2.display();
		System.out.println(m2.toString());
		
		System.out.println();
		
		System.out.println("Employee Wage Default Constructor");
		WageEmp we1 = new WageEmp();
		we1.calculateWage();
		we1.display();
		System.out.println(we1.toString());
		
		System.out.println();
		
		System.out.println("Employee Wage Parameterized Constructor");
		WageEmp we2 = new WageEmp(3, "Michael Doe", 8, 200);
		we2.display();
		System.out.println(we2.toString());

	}

}
