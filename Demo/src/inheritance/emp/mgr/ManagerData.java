package inheritance.emp.mgr;

import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData{
	
	public Manager getEmployee() {
		
		return new Manager();
				
	}

}
