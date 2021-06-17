package inheritance.covarient;

import inheritance.emp.EmployeeData;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovarientMain {

	public static void main(String[] args) {
		
		System.out.println("Employee Details :- ");
		EmployeeData ed1 = new EmployeeData();
		System.out.println(ed1.getEmployee());
		
		
		System.out.println();
		
		System.out.println("Manager Details :- ");
		ManagerData md1 = new ManagerData();
		System.out.println(md1.getEmployee());
		
		
		System.out.println();
		
		System.out.println("Employee Wage Details :- ");
		WageEmpData ewd1 = new WageEmpData();
		System.out.println(ewd1.getEmployee());
		
	}

}
