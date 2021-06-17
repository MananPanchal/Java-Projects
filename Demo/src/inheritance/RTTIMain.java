package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {
	
	public static void showEmpInfo(Employee emp) {
		
		System.out.println(emp.toString());
		
		System.out.println();
		
		// To check dynamic type with Instanceof operator 
				
		if(emp instanceof Manager) {
			
			System.out.println("Manager details : ");
			((Manager) emp).display();
			((Manager) emp).showIncentives();
						
		}
		
		System.out.println();
		
		if(emp instanceof WageEmp) {
			
			System.out.println("Employee details : ");
			((WageEmp) emp).display();
			((WageEmp) emp).calculateWage();
						
		}
		
	}

	public static void main(String[] args) {
		
		Manager m1 = new Manager(1, "John Doe", 10000, 1000);
		showEmpInfo(m1);
		
		WageEmp we1 = new WageEmp(2,"Jane Doe", 8, 100);
		showEmpInfo(we1);
		
	}

}
