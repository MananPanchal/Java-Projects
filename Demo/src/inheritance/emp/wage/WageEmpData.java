package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;

public class WageEmpData extends EmployeeData{
	
	public WageEmp getEmployee() {
		
		return new WageEmp();
		
	}

}
