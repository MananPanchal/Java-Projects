/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package containment.date;

public class ContainmentMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmployeeData(1, "John Doe", new MyDate(10,6,2021));
		
		System.out.println("Using Getter Methods: ");
		System.out.println("Employee ID : " + e1.getEmpId());
		System.out.println("Employee Name : " + e1.getName());
		System.out.println("Employee Birth Date " + e1.getBirthDate());
		
		System.out.println();
		
		String str = e1.toString();
		System.out.println(str);
		
		System.out.println();
		
		Employee e2 = new Employee(2, "Jane Doe", new MyDate(20,6,2021));
		e2.display();

	}

}
